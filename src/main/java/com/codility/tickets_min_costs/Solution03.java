package com.codility.tickets_min_costs;

public class Solution03 implements Solution
{
  public int solution(int[] A) 
  {
    if (A == null) return -1;

    int sevenDays = 7;
    int dayCost = 2, weekCost = 7, monthCost = 25;
    int ratio_WeekAndDays = weekCost / dayCost; 

    int len = A.length;
    if (len == 0) return -1;
<<<<<<< HEAD:src/main/java/com/codility/tickets_min_costs/Solution03.java
    if (len <= 3) return len * dayCost;
=======

    // if total traveling days lower than 3, buy individual day ticket is better
    if (len <= 3) return len * dayCost; 
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e:src/test/java/com/example/Tickets_Needed_To_Get_Minimum_Costs/Solution03v4.java
    
    int cost[] = new int[len];

    int i = 0;
    while (i < len)
    {
      int startIdx = i, endIdx = i + 1; 
      while(endIdx < len && A[endIdx]-A[startIdx] < sevenDays) endIdx++;
      
      if (endIdx-startIdx > ratio_WeekAndDays)
      {
<<<<<<< HEAD:src/main/java/com/codility/tickets_min_costs/Solution03.java
=======
        /* if continued traveling days more than 7, purchase week ticket first, 
         * then consequence deal with the remainder traveling days
         */
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e:src/test/java/com/example/Tickets_Needed_To_Get_Minimum_Costs/Solution03v4.java
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
