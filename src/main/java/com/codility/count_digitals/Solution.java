package com.codility.count_digitals;

<<<<<<< HEAD
public class Solution
{
  public int solution(int N) 
  {
    int cnt = 0;
    int num = powerN(11, N);
    
    String str = Integer.toString(num);
    for (int i=0; i<str.length(); i++) 
    {
      if (str.charAt(i) == '1') cnt++;
    }
    
    return cnt;
  }
  
  private int powerN(int num, int power) 
  {
    if (power == 0) return 1;

    int result = 1;
    for (int i=0; i<power; i++) {
        result *= num;
    }

    return result;
  }
=======
public interface Solution 
{
    public int solution(int N);
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e
}
