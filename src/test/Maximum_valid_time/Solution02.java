package test.Maximum_valid_time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution02
{
  List<List<Integer>> perms = null;

  public String solution(int A, int B, int C, int D) 
  {
    perms = new ArrayList<List<Integer>>();
    
    int[] nums = { A, B, C, D } ;
    List<List<Integer>> possible = permuteUnique(nums);
   
//    System.out.println("[");
//    for (List<Integer> list : possible)
//      System.out.println(" "+list);
//    System.out.println("]");
    
    int maxHH = -1, maxMM = -1;
    String res = "NOT POSSIBLE";
    for (List<Integer> list : possible)
    {
      int hh = list.get(0) * 10 + list.get(1);
      if (hh > 23) continue;
      
      int mm = list.get(2) * 10 + list.get(3);
      if (mm > 59) continue;
      
      if (hh > maxHH || (hh == maxHH && mm > maxMM))
      {
        maxHH = hh; maxMM = mm;
        res = list.get(0).toString() + list.get(1).toString() + ":"
            + list.get(2).toString() + list.get(3).toString();
      }
    }
    return res;
  }
  
  private List<List<Integer>> permuteUnique(int[] nums) 
  {
    Set<List<Integer>> set = new HashSet<List<Integer>>();

    Arrays.sort(nums);
    List<Integer> idxList = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++) idxList.add(i);

    permute(idxList, 0, nums.length);

    for (int i=0; i<perms.size(); i++)
    {
      List<Integer> tmp = perms.get(i);

      for (int j=0; j<tmp.size(); j++) {
        tmp.set(j, nums[tmp.get(j)]);
      }
      if (!set.contains(tmp)) set.add(tmp);
    }
    return new ArrayList<List<Integer>>(set);
  }
  
  private void permute(List<Integer> list, int start, int len)
  {
    if (start == len) {
      perms.add(new ArrayList<Integer>(list));
    }
    else
    {
      for (int i=start; i<len; i++)
      {
        int tmp = list.get(start); 
        list.set(start, list.get(i)); 
        list.set(i, tmp);
        
        permute(list, start+1, len);

        tmp = list.get(start); 
        list.set(start, list.get(i)); 
        list.set(i, tmp);
      }
    }
  }
}
