package main.FindSmallestNotExistPositiveInteger;

import java.util.ArrayList;
import java.util.List;

public class Solution000
{
  public int solution(int[] A) 
  {
    int res = 1;
    if (A == null || A.length == 0) return res;
    
    List<Integer> list = new ArrayList<Integer>();
    for (int n : A) list.add(n);

    while (list.contains(res)) {
      res++;
    }
    return res;
  }
}

