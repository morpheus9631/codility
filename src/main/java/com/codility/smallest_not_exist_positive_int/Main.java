package com.codility.smallest_not_exist_positive_int;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        TestCase[] testcaseAry = new TestCase[3];
        testcaseAry[0] = new TestCase(new int[] {1,3,6,4,1,2}, 5);
        testcaseAry[1] = new TestCase(new int[] {1,2,3}, 4);
        testcaseAry[2] = new TestCase(new int[] {-1,-3}, 1);

        Solution sol = new Solution(); 

        for (TestCase tc : testcaseAry)
        {
            String format = "Input: %s\r\nOutput: %d\r\n";
        
            int[] A = tc.getNums();
            int result = sol.solution(A);
    
            String inStr = Arrays.toString(A); 
            System.out.println(String.format(format, inStr, result));
        }
    }
}
