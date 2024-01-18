package main.MonkeyJumpCrossRiver;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import main.MonkeyJumpCrossRiver.Solution;

class Testing {

  @Test
  void test()
  {
    Solution sol = new Solution();       
    String format = "D = %d, A = %s\r\nreturn %d\r\n";
        
    TestCase tc;
    int D, R; int[] A;
    
    tc = new TestCase01();
    D = tc.getD();
    A = tc.getCase();
    R = tc.getReturn();
    assertEquals(R, sol.solution(A, D)); 
    System.out.println(String.format(format, D, Arrays.toString(A), R));
    
    tc = new TestCase02();
    D = tc.getD();
    A = tc.getCase();
    R = tc.getReturn();
    assertEquals(R, sol.solution(A, D)); 
    System.out.println(String.format(format, D, Arrays.toString(A), R));

    tc = new TestCase03();
    D = tc.getD();
    A = tc.getCase();
    R = tc.getReturn();
    assertEquals(R, sol.solution(A, D)); 
    System.out.println(String.format(format, D, Arrays.toString(A), R));
    
  }

}
