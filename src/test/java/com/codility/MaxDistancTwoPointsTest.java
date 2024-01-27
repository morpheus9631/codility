package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.codility.max_distance.Solution;
import com.codility.max_distance.Solution01;

public class MaxDistancTwoPointsTest 
{
    private int[][] testcaseAry = {
        { 1, 1, 2, 3 },
        { 2, 4, 2, 4 }
    };

    private int[] expectedAry = { 5, 8 };

    @Test
    public void testSolution()
    {
        Solution sol = new Solution01();

        for (int i=0; i<testcaseAry.length; i++) 
        {
            int[] testcase = testcaseAry[i];

            int A = testcase[0];
            int B = testcase[1];
            int C = testcase[2];
            int D = testcase[3];
            int actual = sol.solution(A, B, C, D);
        
            int expected = expectedAry[i];
            assertEquals(expected, actual);
        }
    }
}