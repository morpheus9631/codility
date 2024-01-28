package com.codility;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.codility.max_num_among_siblings.Solution;

public class MaxNumAmongSiblingsTest 
{
    private int[] testcaseAry = { 213, 553 };
    private int[] expectedAry = { 321, 553 };

    @Test
    public void testSolution()
    {
        Solution sol = new Solution();

        for (int i=0; i<testcaseAry.length; i++)
        {
            int testcase = testcaseAry[i];
            int expected = expectedAry[i];
            int actual = sol.solution(testcase);
            assertEquals(expected, actual);
        }
    }
    
}
