package test.Tickets_Needed_To_Get_Minimum_Costs;

public class Solution03v1 implements Solution03
{
  public int solution(int[] A) 
  {
    int len = A.length;
    if (len >= 25) return 25;     //25+ days = 25
    if (len <= 3) return len * 2; // 3 days*2 = 6 < 7   

    int idx = 0;
    int daysCount = 0;
    int finalAmount = 0;
    int seventh = 0;
    int totalCount = 0;
    boolean isJumpLoopFinish = false;

    for (int i=0; i<len; i++) 
    {
      if (isJumpLoopFinish == true) {
        seventh++;
        break;
      }

      daysCount = 0;
      idx = A[i] + 7;
      totalCount++;

      for (int j=i+1; j<len; j++) 
      {
        if ((daysCount >= 3) && (A[j] < idx) && (j == (len-1))) 
          isJumpLoopFinish = true;

        if (A [j] < idx) 
          daysCount++;
        else 
        {
          if (daysCount > 3) 
          {
            seventh++;
            daysCount = 0;
            i = j-1;
          } 
          else
            daysCount = 0;
          break;
        }
      }
    }

    totalCount = totalCount - seventh;
    finalAmount = (totalCount * 2) + (seventh * 7);

    if (finalAmount > 25) finalAmount = 25;

    return finalAmount;
  }
}
