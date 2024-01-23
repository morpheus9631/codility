package com.codility.max_valid_time;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
            int A = nums[0];
            int B = nums[1];
            int C = nums[2];
            int D = nums[3];

            String result = sol.solution(A, B, C, D);
            String actual = actualAry[i];
            assertEquals(actual, result);
            i++;
        }
    }
}
