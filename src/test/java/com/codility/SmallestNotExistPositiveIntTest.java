package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

import com.codility.smallest_not_exist_positive_int.Solution;
import com.codility.smallest_not_exist_positive_int.Solution01;

public class SmallestNotExistPositiveIntTest 
{
    private int[][] testcaseAry =  {
        {  1,  3, 6, 4, 1, 2 },
        {  1,  2, 3},
        { -1, -3}
    };

    private int[] expectedAry = { 5, 4, 1 };

    @Test
    public void testSoultion()
    {
        Solution sol = new Solution01(); 
        String format = "Input: %s\r\nOutput: %d\r\n";
    
        for (int i=0; i<testcaseAry.length; i++)
        {
            int[] testcase = testcaseAry[i];
            int expected = expectedAry[i];
            int actual = sol.solution(testcase);
            
            assertEquals(expected, actual);
        }
    }
}
