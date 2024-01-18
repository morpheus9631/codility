package test.Maximum_valid_time;

import java.util.ArrayList;
import java.util.List;

public class Solution02v2P
{
  public String solution(int A, int B, int C, int D) 
  {
    int[] nums = { A, B, C, D } ;

    List<List<Integer>> possible = permuteUnique(nums);
    
    System.out.println("[");
    for (List<Integer> list : possible)
      System.out.println(" "+list);
    System.out.println("]");
    
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
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    permute(nums, 0, nums.length, list);
    return list;
  }
  
  private void permute(int[] nums, int start, int len, List<List<Integer>> res)
  {
    if (start == len) 
    {
      List<Integer> list = new ArrayList<Integer>();
      for (int n : nums) list.add(n);
      if (!res.contains(list)) res.add(list);
    }
    else
    {
      for (int i=start; i<len; i++)
      {
        int tmp = nums[start]; 
        nums[start] = nums[i]; 
        nums[i] = tmp;;
        
        permute(nums, start+1, len, res);

        tmp = nums[start]; 
        nums[start] = nums[i]; 
        nums[i] = tmp;;
      }
    }
  }
}
