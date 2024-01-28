package com.codility.winter_an_summer;

import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Winter and Summer time\r\n");
        
        Solution sol = new Solution();
        String format = "T: %s\r\nWiter time is %d\r\n";

        for (TestCase tc : getTestCaseAry())
        {
            int[] nums = tc.getNums();
            int result = sol.solution(nums);

            String inStr = Arrays.toString(nums);
            System.out.println(String.format(format, inStr, result));
        }
    }

    private static TestCase[] getTestCaseAry()
    {
        TestCase[] testcaseAry = new TestCase[2];
        testcaseAry[0] = new TestCase(new int[] { 5, -2, 3, 8, 6 }, 3);
        testcaseAry[1] = new TestCase(new int[] { -5, -5, -5, -42, 6, 12 }, 4);
        return testcaseAry;
    }
}

