package com.codility.count_digitals;
<<<<<<< HEAD

public class Main {
=======
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e

public class Main 
{
  public static void main(String[] args)
  {
    System.out.println("Count number of '1' digits in 11 to the power of N\r\n");
    
<<<<<<< HEAD
    Solution sol = new Solution();
    String format = "N = %d\r\n11^N has %d digital '1'\r\n"; 
    
    int N = 7;
=======
    Solution01 sol = new Solution01();
    String format = "N = %d\r\nN has %d digital '1'\r\n"; 
    
    int N = 6;
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e
    int res = sol.solution(N);
    System.out.println(String.format(format, N, res));
  }
}
