package com.codility.smallest_not_exist_positive_int;

import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    int[][] testdata = new int[][] {
        {1,3,6,4,1,2}   // 5
      , {1,2,3}         // 4
      , {-1,-3}         // 1
    };

    Solution sol = new Solution01(); 
    String format = "Input: %s\r\nOutput: %d\r\n";
    
    for (int[] A : testdata)
    {
      int res = sol.solution(A);
    
      String inStr = Arrays.toString(A); 
      System.out.println(String.format(format, inStr, res));
    }
  }

}
