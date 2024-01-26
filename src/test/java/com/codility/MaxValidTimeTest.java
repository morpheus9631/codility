package com.codility;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.codility.max_valid_time.Solution02v2;

public class MaxValidTimeTest 
{
    private int[][] testcaseAry = 
    { 
        { 1, 8, 3, 2},
        { 2, 4, 0, 0},
        { 3, 0, 7, 0},
        { 9, 1, 9, 7} 
    };

    private String[] expectedAry = { 
        "23:18", "20:40", "07:30", "NOT POSSIBLE"
    };


    @Test
    public void testSolution()
    {
        Solution02v2 sol = new Solution02v2();

        for (int i=0; i<testcaseAry.length; i++)
        {
            int[] testcase = testcaseAry[i];
            int A = testcase[0];
            int B = testcase[1];
            int C = testcase[2];
            int D = testcase[3];
            
            String expected = expectedAry[i];
            
            String actual = sol.solution(A, B, C, D);
            assertEquals(expected, actual);
        }
    }
}
