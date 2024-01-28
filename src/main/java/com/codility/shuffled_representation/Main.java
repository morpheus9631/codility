package com.codility.shuffled_representation;

public class Main
{
  public static void main(String[] args)
  {
    int[] testdata = { 123456, 130, 12345678, 1234567 };

    Solution sol = new Solution(); 

    String format = "Input: %d\r\nOutput: %d\r\n";
    
    for (int A : testdata)
    {
      int result = sol.solution(A);
      System.out.println(String.format(format, A, result));
    }
  }
}
