package com.example.CountVisibleNodesInBinaryTree;

public class Solution 
{
  public int solution(Tree T) 
  {
    return numVisible(T, T.x);
  }
  
  public int numVisible(Tree T, int maxVal)
  {
    if (T == null) {
      return 0;
    }
    
    int num = 0;
    if (T.x >= maxVal) {
      num=1;
      maxVal = T.x;
    }
    
    int res = num 
            + numVisible(T.l, maxVal)
            + numVisible(T.r, maxVal);
    return res;
  }
}
