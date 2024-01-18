package main.SplitTextIntoEqualLengthSubstrings;

public class Main
{
  public static void main(String[] args)
  {
    String[] testdata = new String[] {
        "SMS messages are really short"
      , "Hello there, my name is not importnant right now."
      + " I am just simple sentecne used to test few things."
    };
    
    int K = 12;
    String format = "", outstr = "";
   
    Solution001 sol = new Solution001v2(); 
    for (int i=0; i<testdata.length; i++)
    {
      String S = testdata[i];
      
      format = "Input: \"%s\"";
      outstr = String.format(format, S);
      System.out.println(outstr);
      
      int res = sol.solution(S, K);

      format = "\r\nOutput: %d\r\n";
      outstr = String.format(format,  res);
      System.out.println(outstr);
    }
  }

}
