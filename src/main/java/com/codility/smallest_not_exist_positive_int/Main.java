package com.codility.smallest_not_exist_positive_int;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        TestCase tc = new TestCase(
            new int[] {1,3,6,4,1,2}, 5
        );

        Solution sol = new Solution(); 
        String format = "Input: %s\r\nOutput: %d\r\n";
        
        int[] A = tc.getNums();
        int result = sol.solution(A);

        String inStr = Arrays.toString(A); 
        System.out.println(String.format(format, inStr, result));
    }
}
