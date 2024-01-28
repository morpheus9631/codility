package com.codility.monkey_jump_cross_river;

import java.util.Arrays;

public class Solution 
{
  public int solution(int[] A, int D) 
  {
    int N = A.length;
    
    boolean stones[] = new boolean[N+2];
    Arrays.fill(stones, false);
    stones[0] = true;
    stones[N+1] = true;
    
    for (int i=0; i<=N; i++) 
    {
      for (int j=0; j<N; j++) {
        if (A[j] == i) { stones[j+1] = true; }
      }

      boolean isCrossRiver = checkCrossRiver(stones, D);
      
      if (isCrossRiver) return i;
    }
    return -1;
  }
  
  private boolean checkCrossRiver(boolean[] stones, int D)
  {
    boolean isJump = stones[0];
    
    int i = 0; 
    int len = stones.length; 
    while (i < len-1 && isJump == true) 
    {
      isJump = false;
      for (int j=D; j>0; j--) 
      {
        int idx = (i+j < len-1) ? (i+j) : (len-1);
        isJump = (isJump || stones[idx]); 
        if (isJump) {
          i = idx;
          break;
        }
      }
    }
    
    return isJump;
  }
}

