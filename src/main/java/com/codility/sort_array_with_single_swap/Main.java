package com.codility.sort_array_with_single_swap;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] testcase = new int[] {1,5,3,3,7};

        Solution sol = new Solution(); 

        String format = "Input: %s\r\nOutput: %b\r\n";
        
        String inStr = Arrays.toString(testcase); 
        boolean result = sol.solution(testcase);
        System.out.println(String.format(format, inStr, result));
    }
}

    