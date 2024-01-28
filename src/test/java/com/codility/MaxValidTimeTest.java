package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.max_valid_time.Solution;
import com.codility.max_valid_time.Solution01;
import com.codility.max_valid_time.Solution02;
import com.codility.max_valid_time.TestCase;

public class MaxValidTimeTest 
{
    private TestCase[] testcaseAry;

    @Before
    public void setupTestCase()
    {
        testcaseAry = new TestCase[4];
        testcaseAry[0] = new TestCase( new int[] {1,8,3,2}, "23:18");
        testcaseAry[1] = new TestCase( new int[] {2,4,0,0}, "20:40");
        testcaseAry[2] = new TestCase( new int[] {3,0,7,0}, "07:30");
        testcaseAry[3] = new TestCase( new int[] {9,1,9,7}, "NOT POSSIBLE");
    }

    @Test
    public void testSolution01()
    {
        Solution sol = new Solution01();
        for (TestCase tc : testcaseAry)
        {
            int[] nums = tc.getNums();
            int A = nums[0];
            int B = nums[1];
            int C = nums[2];
            int D = nums[3];
            
            String expected = tc.getExpected();
            
            String actual = sol.solution(A, B, C, D);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testSolution02()
    {
        Solution sol = new Solution02();
        for (TestCase tc : testcaseAry)
        {
            int[] nums = tc.getNums();
            int A = nums[0];
            int B = nums[1];
            int C = nums[2];
            int D = nums[3];
            
            String expected = tc.getExpected();
            
            String actual = sol.solution(A, B, C, D);
            assertEquals(expected, actual);
        }
    }
}
