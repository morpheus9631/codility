package com.codility.count_digitals;

public class Main 
{
  public static void main(String[] args)
  {
    System.out.println("Count number of '1' digits in 11 to the power of N\r\n");
    
    Solution sol = new Solution();
    String format = "N = %d\r\nN has %d digital '1'\r\n"; 
    
    int N = 6;
    int res = sol.solution(N);
    System.out.println(String.format(format, N, res));
  }
}
