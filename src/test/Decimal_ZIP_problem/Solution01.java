package test.Decimal_ZIP_problem;

class Solution01
{
  public int solution(int A, int B) 
  {
    int limit = 100000000;
    if (A > limit || B > limit) return -1;
    
    String strA = Integer.toString(A);
    String strB = Integer.toString(B);
    
    int lenA = strA.length(); 
    int lenB = strB.length();
    
    StringBuffer sb = new StringBuffer();
    
    int i=0, j=0;
    while (i < lenA && j < lenB)
    {
      char ch1 = strA.charAt(i++);
      char ch2 = strB.charAt(j++);
      
      sb.append(ch1);
      sb.append(ch2);
    }
    
    while (i < lenA) sb.append(strA.charAt(i++));
    while (j < lenB) sb.append(strB.charAt(j++));

    long res = Long.valueOf(sb.toString());
    if (res > limit) res = -1;
    return (int)res;
  }
}