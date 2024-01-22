package test.Tickets_Needed_To_Get_Minimum_Costs;

import java.util.Arrays;

public class Solution03v4P
{
  public int solution(int[] A) 
  {
    if (A == null) return -1;

    int sevenDays = 7;
    int dayCost = 2, weekCost = 7, monthCost = 25;
    int ratio_WeekAndDays = weekCost / dayCost; 

    int len = A.length;
    if (len == 0) return -1;
    if (len <= 3) return len * dayCost; // 少�?��?�於 3 次�?�買?��票�?��?�便�?
    if (len > 12) return monthCost;     // ??�為超�?? 12 次買??�票比�?�便�?
    
    int cost[] = new int[len];

    String format1 = "%2d: %2d, %2d, %s";
    String format2= "%2d:         %s";
    String format3= "Res:        %s";
        
    int i = 0;
    while (i < len)
    {
      int startIdx = i, endIdx = i + 1; 
      while(endIdx < len && A[endIdx]-A[startIdx] < sevenDays) endIdx++;
      
      System.out.println(
          String.format(format1, i, startIdx, endIdx, Arrays.toString(cost)));

      if (endIdx-startIdx > ratio_WeekAndDays)
      {
        // 如�?��??續出差�?��?��??��，�?��?�買�?次周票�?�剩下�?��?��?��??
        if (endIdx >= startIdx + sevenDays) endIdx = startIdx + sevenDays;  
        
        int j = startIdx;
        cost[j] = ((j == 0) ? 0 : cost[j-1]) + weekCost;

        while (++j < endIdx) 
        {
          cost[j] = cost[j-1];
          System.out.println(
              String.format(format2, j, Arrays.toString(cost)));
        }  
        i = j;
      }
      else
      {
        cost[i] = ((i == 0) ? 0 : cost[i-1]) + dayCost;
        i++;
      }  
    }
    System.out.println(String.format(format3, Arrays.toString(cost)));
    
    int finalCost = Math.min(cost[len-1], monthCost);
    
    return finalCost;  
  }
}
