package com.codility;

import org.junit.Test;

import com.codility.count_visible_nodes.Solution;
import com.codility.count_visible_nodes.Solution01;
import com.codility.count_visible_nodes.Tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CountVisibleNodesTest 
{
    private Tree[] testcaseAry = new Tree[2];

    private int[] expectedAry = { 4, 2 };

    @Before
    public void setup()
    {
        testcaseAry[0] = createTree01();
        testcaseAry[1] = createTree02();
    }

    @Test
    public void test()
    {
        Solution sol = new Solution01();

        for (int i=0; i<testcaseAry.length; i++)
        {
            Tree testcase = testcaseAry[i];
            int expected = expectedAry[i];
            int actual = sol.solution(testcase);
            assertEquals(expected, actual);
        }
    }

    private Tree createTree01()
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

    private Tree createTree02()
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
