package com.example.TicketsNeededToGetMinimumCosts;

public class Solution003 implements Solution
{
  public int solution(int[] A) 
  {
    if (A == null) return -1;

    int sevenDays = 7;
    int dayCost = 2, weekCost = 7, monthCost = 25;
    int ratio_WeekAndDays = weekCost / dayCost; 

    int len = A.length;
    if (len == 0) return -1;
    if (len <= 3) return len * dayCost;
    
    int cost[] = new int[len];

    int i = 0;
    while (i < len)
    {
      int startIdx = i, endIdx = i + 1; 
      while(endIdx < len && A[endIdx]-A[startIdx] < sevenDays) endIdx++;
      
      if (endIdx-startIdx > ratio_WeekAndDays)
      {
        if (endIdx >= startIdx + sevenDays) endIdx = startIdx + sevenDays;  
        
        int j = startIdx;
        cost[j] = ((j == 0) ? 0 : cost[j-1]) + weekCost;

        while (++j < endIdx) {
          cost[j] = cost[j-1];
        }  
        i = j;
      }
      else
      {
        cost[i] = ((i == 0) ? 0 : cost[i-1]) + dayCost;
        i++;
      }  
    }
    int finalCost = Math.min(cost[len-1], monthCost);
    
    return finalCost;  
  }
}
