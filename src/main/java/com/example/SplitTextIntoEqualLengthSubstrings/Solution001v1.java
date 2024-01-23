package main.SplitTextIntoEqualLengthSubstrings;

public class Solution001v1 implements Solution001
{
  public int solution(String S, int K) 
  {
    int res = 0;
    if (S == null  || K < 1) return res;
    
    String[] array = S.trim().split(" ");

    int len = array.length; 
    int[] dp = new int[len];
    for (int i=0; i<len; i++) { dp[i] = array[i].length(); }
    
    int[] new_dp= new int[len];
    new_dp[0] = dp[0];
    
    for (int i=1; i<len; i++) 
    {
      int sum = dp[i] + new_dp[i-1] + 1;

      if (sum >= K) {
        new_dp[i] = (sum >= K) ? dp[i] : sum;
      } else {
        new_dp[i] = sum;
      }
    }
    
    int cnt = 0;
    for (int i=1; i<len; i++) {
      if (new_dp[i] < new_dp[i-1]) cnt++;
    }
    cnt++;

    return cnt;
  }
}
