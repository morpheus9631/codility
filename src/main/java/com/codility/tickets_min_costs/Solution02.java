package com.codility.tickets_min_costs;

/*
 * Reference:
 * 
 * [1] https://discuss.leetcode.com/topic/41061/tickets-needed-to-get-minimum-cost
 * 
 * [2] http://stackoverflow.com/questions/40559246/find-minimum-cost-of-tickets
 * 
 */

public class Solution02 implements Solution
{
  public int solution(int[] A) 
  {
    int len = A.length;
    int cost[] = new int[len];
    
    int oneDayCost = 2, sevenDayCost = 7, thirtyDayCost = 25;
    cost[0] = oneDayCost;
    
    for (int i=1; i<len; i++) 
    {
      cost[i] = cost[i-1] + oneDayCost;
      int diff = A[i] - A[0];

      if (i >= 3) 
      {
        int pass7Cost = ((diff + 1) / 7) * sevenDayCost;
        
        int pass7RemainDaysCost = (((diff + 1) % 7) * oneDayCost) < sevenDayCost 
                                ? (((diff + 1) % 7) * oneDayCost)
                                : sevenDayCost;
        
        pass7Cost += pass7RemainDaysCost;
        cost[i] = cost[i] > pass7Cost ? pass7Cost : cost[i];
      }
      else if (i >= 12) 
      {
        int pass30Cost = ((diff+1) / 30) * thirtyDayCost;
        int pass30RemainsCost1DayPass = ((diff+1) % 30) * oneDayCost;
        int pass30RemainsCost7DayPass = ((diff+1) % 30) / 7 * sevenDayCost;
        int pass30RemainsCost7DayPassRemain1DayPass = ((diff+1) % 30) % 7 * oneDayCost;
      
        int pass30RemainsCost7DayTot = pass30RemainsCost7DayPass
            + (pass30RemainsCost7DayPassRemain1DayPass < sevenDayCost ? pass30RemainsCost7DayPassRemain1DayPass
                : sevenDayCost);
        
        int pass30orPass7 = (pass30RemainsCost7DayTot < pass30RemainsCost1DayPass ? pass30RemainsCost7DayTot
            : pass30RemainsCost1DayPass);
        
        int pass30CostFinal = pass30Cost + (pass30orPass7 < thirtyDayCost ? pass30orPass7 : thirtyDayCost);
        
        cost[i] = cost[i] > pass30CostFinal ? pass30CostFinal : cost[i];
      } 
    }
    return cost[len-1];  
  }
}
