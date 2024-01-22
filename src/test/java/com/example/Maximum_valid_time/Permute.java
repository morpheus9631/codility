package test.Maximum_valid_time;

import java.util.ArrayList;
import java.util.List;

public class Permute
{
  public static void main(String[] args)
  {
    int[] nums = {1,2,3,4};
    
    List<List<Integer>> perms = permuteUnique(nums);
    
    String outstr = "[";
    for (List<Integer> list : perms)
      outstr += "\r\n " + list.toString();
    outstr += "\r\n]";
    System.out.println(outstr);
  }
  
  private static List<List<Integer>> permuteUnique(int[] nums) 
  {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    permute(nums, 0, nums.length, res);
    return res;
  }
  
  private static void permute(int[] nums, int start, int len, List<List<Integer>> res)
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
