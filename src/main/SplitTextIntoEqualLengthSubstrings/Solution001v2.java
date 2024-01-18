package main.SplitTextIntoEqualLengthSubstrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution001v2 implements Solution001
{
  @Override
  public int solution(String S, int K)
  {
    String data = S;
    int maxLenght = K;
    Pattern p = Pattern.compile("\\G\\s*(.{1,"+maxLenght+"})(?=\\s|$)", Pattern.DOTALL);
    Matcher m = p.matcher(data);
    
    System.out.println("\r\nSubstrings:");
    int cnt = 0;
    while (m.find()) {
      cnt++;
      System.out.println("  "+m.group(1));
    }
    return cnt;
  }
}
