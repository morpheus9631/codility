package main.Maximize_Distance_Two_Points;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution001
{
  public int solution(int A, int B, int C, int D) 
  {
  	int max_dis = 0;
  	for(List<Integer> pl : Permutation.perm(Arrays.asList(A,B,C,D)))
  	{
  		int x1 = pl.get(0);
  		int y1 = pl.get(1);
  		int x2 = pl.get(2);
  		int y2 = pl.get(3);
  		int dis = distance(x1, y1, x2, y2);
  		if (dis > max_dis) max_dis = dis;
    }
  	return max_dis;
  }
  
  private int distance(int x1, int y1, int x2, int y2)
  {
  	return (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
  }
}

class Permutation 
{
  public static <T> List<T> rotatedTo(int i, List<T> list) 
  {
    List<T> rotated = new ArrayList<>();
    rotated.add(list.get(i));
    rotated.addAll(list.subList(0, i));
    rotated.addAll(list.subList(i + 1, list.size()));
    return rotated;
  }

  public static <T> List<List<T>> allRotated(List<T> list) 
  {
    List<List<T>> allRotated = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      allRotated.add(rotatedTo(i, list));
    }
    return allRotated;
  }
          
  public static <T> List<List<T>> perm(List<T> list) 
  {
    List<List<T>> pls = new ArrayList<>();
      
    if (list.isEmpty()) {
      pls.add(new ArrayList<T>());
    } else {
      for(List<T> lt : allRotated(list)) {
        for(List<T> tailPl : perm(lt.subList(1, lt.size()))) {
          List<T> pl = new ArrayList<>();
          pl.add(lt.get(0));
          pl.addAll(tailPl);
          pls.add(pl);
        }
      }
    }
      
    return pls;
  }
}                
