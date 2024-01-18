package main.ShuffledRepresentation;

public class Solution002
{
  public int solution(int A) 
  {
    if (A < 0 || A > 100000000) return -1;
    
    StringBuffer sb = new StringBuffer();
    
    String str = Integer.toString(A);
    int i = 0, j = str.length() - 1;
    while (i < j)
    {
      sb.append(str.charAt(i++));
      sb.append(str.charAt(j--));
    }
    
    if (i == j) sb.append(str.charAt(i));
    
    return Integer.valueOf(sb.toString());
  }
}
