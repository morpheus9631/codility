package test.Tickets_Needed_To_Get_Minimum_Costs;

import java.util.Arrays;

public class Solution03v3
{
  public int solution(int[] A) 
  {
    int len = A.length;
    int cost[] = new int[len];
    
    int oneDayCost = 2, sevenDayCost = 7, thirtyDayCost = 25;
    cost[0] = oneDayCost;
    
    System.out.println();
    for (int i=1; i<len; i++) 
    {
      cost[i] = cost[i-1] + oneDayCost;
      int diff = A[i] - A[0] + 1;

      System.out.println(i+": "+diff+", "+Arrays.toString(cost));
      
      if (i >= 3)  
      {
        int pass7Cost = (diff / 7) * sevenDayCost;
        System.out.println("\r\n pass7Cost: "+pass7Cost);
        
        int pass7RemainDaysCost = ((diff % 7) * oneDayCost) < sevenDayCost 
                                ? ((diff % 7) * oneDayCost) : sevenDayCost;
        System.out.println(" pass7RemainDaysCost: "+pass7RemainDaysCost);
                                
        pass7Cost += pass7RemainDaysCost;
        System.out.println(" pass7Cost: "+pass7RemainDaysCost);

        cost[i] = (cost[i] > pass7Cost) ? pass7Cost : cost[i];
      }
      else if (i >= 12) 
      {
        int pass30Cost = (diff / 30) * thirtyDayCost;
        int pass30RemainsCost1DayPass = (diff % 30) * oneDayCost;
        int pass30RemainsCost7DayPass = (diff % 30) / 7 * sevenDayCost;
        int pass30RemainsCost7DayPassRemain1DayPass = (diff % 30) % 7 * oneDayCost;
      
        int pass30RemainsCost7DayTot = pass30RemainsCost7DayPass
            + ((pass30RemainsCost7DayPassRemain1DayPass < sevenDayCost) 
            ? pass30RemainsCost7DayPassRemain1DayPass : sevenDayCost);
        
        int pass30orPass7 = (pass30RemainsCost7DayTot < pass30RemainsCost1DayPass)
                          ? pass30RemainsCost7DayTot : pass30RemainsCost1DayPass;
        
        int pass30CostFinal = pass30Cost 
                            + (pass30orPass7 < thirtyDayCost ? pass30orPass7 : thirtyDayCost);
        
        cost[i] = (cost[i] > pass30CostFinal) ? pass30CostFinal : cost[i];
      } 
    }
    return cost[len-1];  
  }
}
