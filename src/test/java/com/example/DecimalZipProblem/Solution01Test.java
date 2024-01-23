package com.example.DecimalZipProblem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.DecimalZipProblem.Solution01;

public class Solution01Test
{
    private static int[][] testcaseAry = 
    { 
        { 12, 56, 1526 },
        { 56, 12, 5162 },
        { 12345, 678, 16273845 },
        { 123, 67890, 16273890},
        { 1234, 0, 10234 },
        { 12345, 678, 16273845 },
        { 12345, 67890, -1 },
        { 1234567890, 1, -1 },
        { 123456, 123456, -1 }
    };

    @Test
    public void testZip()
    {
        Solution01 sol = new Solution01();

        for (int[] testcase : testcaseAry)
        {
            int A = testcase[0];
            int B = testcase[1];
            int actual = testcase[2];
            int result = sol.solution(A, B);
            assertEquals(actual, result);
        }
    }
}

  // public static void main(String[] args)
  // {
  //   int[][] testcase = 
  //   { 
  //       {12,56},         // Expected: 1526
  //       {56,12},         // Expected: 5162
  //       {12345,678},     // Expected: 16273845
  //       {123,67890},     // Expected: 16273890
  //       {1234,0},        // Expected: 10234
  //       {12345,678},     // Expected: 16273845
  //       {12345,67890},   // Expected: -1
  //       {1234567890,1},  // Expected: -1
  //       {123456,123456}  // Expected: -1
  //   };
    
  //   for (int[] nums : testcase)
  //   {
  //     int A = nums[0];
  //     int B = nums[1];
  //     System.out.println("A: "+A+", B: "+B);
  //     Solution01 sol = new Solution01();
  //     int res = sol.solution(A, B);
  //     System.out.println("Ans: "+res);
  //     System.out.println("\r\n----------------------------------------\r\n");
  //   }
  // }

