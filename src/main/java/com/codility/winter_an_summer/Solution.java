package com.codility.winter_an_summer;

public class Solution 
{
  public int solution(int[] T) 
  {
    int counter = 1;
    int winterMax = T[0];
    int summerMax = Integer.MIN_VALUE;
    boolean isWinter = true;

    for (int i = 1; i < T.length; i++) 
    {
      int elem = T[i];
      if (isWinter) 
      {
        if (elem > winterMax) {
          isWinter = false;
          counter = i;
        }
      }
      else {
        if (elem <= winterMax) {
          isWinter = true;
          winterMax = summerMax;
        }
      }
      summerMax = Math.max(summerMax, elem);
    }
    if (isWinter) {
      counter = T.length;
    }
    return counter;
  }
}
