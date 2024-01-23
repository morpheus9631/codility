package main.SortArrayInNonDecreasingOrderWithSingleSwap;

import java.util.Arrays;

public class Main
{

  public static void main(String[] args)
  {
    int[][] testdata = new int[][] {
      {1,5,3,3,7}, {1,3,5,3,4}, {1,3,5}   
    };

    Solution003 sol = new Solution003(); 

    String format = "Input: %s\r\nOutput: %b\r\n";
    
    for (int[] A : testdata)
    {
      boolean res = sol.solution(A);

      String inStr = Arrays.toString(A); 
      System.out.println(String.format(format, inStr, res));
    }
  }
}

  