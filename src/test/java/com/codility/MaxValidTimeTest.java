package com.codility;

import static org.junit.Assert.assertEquals;
<<<<<<< HEAD

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
=======
import org.junit.Test;

import com.codility.max_valid_time.Solution02v2;

public class MaxValidTimeTest 
{
    private int[][] testcaseAry = 
    { 
      {1,8,3,2},     // Expected: 23:18
      {2,4,0,0},     // Expected: 20:40
      {3,0,7,0},     // Expected: 07:30
      {9,1,9,7}      // Expected: NOT POSSIBLE
    };

    private String[] actualAry = { 
        "23:18", "20:40", "07:30", "NOT POSSIBLE"
    };


    @Test
    public void testSolution()
    {
        Solution02v2 sol = new Solution02v2();

        int i=0; 
        for (int[] nums : testcaseAry)
        {
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e
            int A = nums[0];
            int B = nums[1];
            int C = nums[2];
            int D = nums[3];
<<<<<<< HEAD
            
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
=======

            String result = sol.solution(A, B, C, D);
            String actual = actualAry[i];
            assertEquals(actual, result);
            i++;
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e
        }
    }
}
