package com.codility;

import org.junit.Test;

import com.codility.count_visible_nodes.Solution;
import com.codility.count_visible_nodes.TestCase;
import com.codility.count_visible_nodes.Solution;
import com.codility.count_visible_nodes.Tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CountVisibleNodesTest 
{
    private TestCase[]  testcaseAry;

    @Before
    public void setup()
    {
        testcaseAry = new TestCase[2];
        testcaseAry[0] = new TestCase(buildTree01(), 4);
        testcaseAry[1] = new TestCase(buildTree02(), 2);
    }

    @Test
    public void test()
    {
        Solution sol = new Solution();

        for (TestCase tc : testcaseAry)
        {
            Tree tree = tc.getTree();
            int expected = tc.getExpected();
            int actual = sol.solution(tree);
            assertEquals(expected, actual);
        }
    }

    private Tree buildTree01()
    {
        Tree T = new Tree();
        T.x = 5;

        T.l = new Tree();
        T.l.x = 3;

        T.r = new Tree();
        T.r.x = 10;
    
        T.l.l = new Tree();
        T.l.l.x = 20;

        T.l.r = new Tree();
        T.l.r.x = 21;

        T.r.l = new Tree();
        T.r.l.x = 1;
    
        return T;
    }

    private Tree buildTree02()
    {
        Tree T = new Tree();
        T.x = 8;
    
        T.l = new Tree();
        T.l.x = 2;
    
        T.r = new Tree();
        T.r.x = 6;
        
        T.l.l = new Tree();
        T.l.l.x = 8;
    
        T.l.r = new Tree();
        T.l.r.x = 7;
        return T;
    }
}
