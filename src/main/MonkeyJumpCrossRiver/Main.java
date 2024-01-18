package main.MonkeyJumpCrossRiver;

import java.util.Arrays;

public class Main {

  public static void main(String[] args)
  {
    System.out.println("Monkey jump cross river\r\n");
    
    Solution sol = new Solution();
    String format = "D = %d, A = %s\r\nReturn %d\r\n";
    
    int D; int[] A;
    TestCase tc;
    
    tc = new TestCase01();
    D = tc.getD();
    A = tc.getCase();
    int res = sol.solution(A, D);
    System.out.println(String.format(format, D, Arrays.toString(A), res));

    tc = new TestCase02();
    D = tc.getD();
    A = tc.getCase();
    res = sol.solution(A, D);
    System.out.println(String.format(format, D, Arrays.toString(A), res));

    tc = new TestCase03();
    D = tc.getD();
    A = tc.getCase();
    res = sol.solution(A, D);
    System.out.println(String.format(format, D, Arrays.toString(A), res));
  }

}
