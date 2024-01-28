package com.codility.max_valid_time;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Find max valid military time:");

        String format = "\r\nFour digitals: %d, %d, %d, %d"
                    + "\r\n\r\nMaximum valid time is %s"
                    + "\r\n\r\n" + new String(new char[30]).replace("\0", "-");
        
        Solution sol = new Solution01();
        for (TestCase tc : getTestCaseAry())
        {
            int[] nums = tc.getNums();
            int A = nums[0];
            int B = nums[1];
            int C = nums[2];
            int D = nums[3];

            String timeStr = sol.solution(A, B, C, D);
            System.out.println(String.format(format, A, B, C, D, timeStr));
        }
    }

    private static TestCase[] getTestCaseAry()
    {
        TestCase[] array = new TestCase[4];
        array[0] = new TestCase( new int[] {1,8,3,2}, "23:18");
        array[1] = new TestCase( new int[] {2,4,0,0}, "20:40");
        array[2] = new TestCase( new int[] {3,0,7,0}, "07:30");
        array[3] = new TestCase( new int[] {9,1,9,7}, "NOT POSSIBLE");
        return array;
    }
}        
