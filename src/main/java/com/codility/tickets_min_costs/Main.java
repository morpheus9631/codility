package com.codility.tickets_min_costs;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Tickets needed to get min costs");
        
        String format = 
            "\r\nTravelling days:\r\n\r\n %s"
            + "\r\n\r\nMin costs: %d"
            + "\r\n\r\n" + new String(new char[40])
                                .replace(   "\0", 
                                            "-");

        Solution sol = new Solution03();

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
        TestCase[] testcaseAry = new TestCase[8];
        testcaseAry[0] = new TestCase(new int[] {1,30}, 4);
        testcaseAry[1] = new TestCase(new int[] {1,2,4,5,7,29,30}, 11);
        testcaseAry[2] = new TestCase(new int[] {1,2,7,8,9,10,11,20,30}, 15);
        testcaseAry[3] = new TestCase(new int[] {1,2,3,4,5,15,16,25,26,27,30}, 18);
        testcaseAry[4] = new TestCase(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 14);
        testcaseAry[5] = new TestCase(new int[] {1,2,3,4,5,6,7,8,9,10,21,22,30}, 19);
        testcaseAry[6] = new TestCase(new int[] {1,2,3,4,5,6,7,21,22,30}, 13);
        testcaseAry[7] = new TestCase(new int[] {1,3,5,7,9,11,13,15,17,19,21,23,25}, 23);
        return testcaseAry;
    }
}
