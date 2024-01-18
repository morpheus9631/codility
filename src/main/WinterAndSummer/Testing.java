package main.WinterAndSummer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

  @Test
  void test()
  {
    Solution sol = new Solution();
    
    TestCase tc;
    int R; int[] T;
    
    tc = new TestCase01();
    T = tc.getCase();
    R = tc.getReturn();
    assertEquals(R, sol.solution(T));
    
    tc = new TestCase02();
    T = tc.getCase();
    R = tc.getReturn();
    assertEquals(R, sol.solution(T));
  }

}
