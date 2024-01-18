package main.ShuffledRepresentation;

public class Main
{
  public static void main(String[] args)
  {
    int[] testdata = new int[] {
        123456      // 162534
      , 130         // 103
      , 12345678    // 103
      , 1234567     // 103
    };

    Solution002 sol = new Solution002(); 

    String format = "Input: %d\r\nOutput: %d\r\n";
    
    for (int A : testdata)
    {
      int res = sol.solution(A);
      System.out.println(String.format(format, A, res));
    }
  }
}
