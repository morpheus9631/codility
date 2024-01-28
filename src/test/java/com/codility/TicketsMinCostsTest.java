package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.tickets_min_costs.*;

public class TicketsMinCostsTest 
{
    private TestCase[] testcaseAry;

    @Before
    public void setupTestCase()
    {
        testcaseAry = new TestCase[8];
        testcaseAry[0] = new TestCase(new int[] {1,30}, 4);
        testcaseAry[1] = new TestCase(new int[] {1,2,4,5,7,29,30}, 11);
        testcaseAry[2] = new TestCase(new int[] {1,2,7,8,9,10,11,20,30}, 15);
        testcaseAry[3] = new TestCase(new int[] {1,2,3,4,5,15,16,25,26,27,30}, 18);
        testcaseAry[4] = new TestCase(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 14);
        testcaseAry[5] = new TestCase(new int[] {1,2,3,4,5,6,7,8,9,10,21,22,30}, 19);
        testcaseAry[6] = new TestCase(new int[] {1,2,3,4,5,6,7,21,22,30}, 13);
        testcaseAry[7] = new TestCase(new int[] {1,3,5,7,9,11,13,15,17,19,21,23,25}, 23);
    }

    // Fail: expected:<18> but was:<19>
    // @Test
    // public void testSolution01()
    // {
    //     Solution sol = new Solution01();

    //     for (TestCase tc : testcaseAry)
    //     {
    //         int[] nums = tc.getNums();
    //         int expected = tc.getExpected();
    //         int result = sol.solution(nums);
    //         assertEquals(expected, result);
    //     }
    // }

    // Fail: expected:<15> but was:<18>
    // @Test
    // public void testSolution02()
    // {
    //     Solution sol = new Solution02();

    //     for (TestCase tc : testcaseAry)
    //     {
    //         int[] nums = tc.getNums();
    //         int expected = tc.getExpected();
    //         int result = sol.solution(nums);
    //         assertEquals(expected, result);
    //     }
    // }

    @Test
    public void testSolution03()
    {
        Solution sol = new Solution03();

        for (TestCase tc : testcaseAry)
        {
            int[] nums = tc.getNums();
            int expected = tc.getExpected();
            int result = sol.solution(nums);
            assertEquals(expected, result);
        }
    }
}
