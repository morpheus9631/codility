package main.CountVisibleNodesInBinaryTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.CountVisibleNodesInBinaryTree.Solution;
import main.CountVisibleNodesInBinaryTree.Tree;

class Testing 
{
  @Test
  void test()
  {
    Solution sol = new Solution();

    TestCase tc = new TestCase01();
    Tree T = tc.getCase();
    int res = tc.getReturn(); 
    assertEquals(res, sol.solution(T)); 

    
    tc = new TestCase02();
    T = tc.getCase();
    res = tc.getReturn();
    assertEquals(res, sol.solution(T)); 
  }
}
