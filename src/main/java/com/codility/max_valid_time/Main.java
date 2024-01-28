package com.codility.max_valid_time;

public class Main
{
<<<<<<< HEAD
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
        
=======
  public static void main(String[] args)
  {
    System.out.println("Find max valid military time:");

    String format = "\r\nFour digitals: %d, %d, %d, %d"
                  + "\r\n\r\nMaximum valid time is %s"
                  + "\r\n\r\n" + new String(new char[30]).replace("\0", "-");
    
    int[][] testcase = getTestCase(); 

    Solution sol = new Solution02v2();
    

    for (int[] nums : testcase)
    {
      int A = nums[0];
      int B = nums[1];
      int C = nums[2];
      int D = nums[3];

      String timeStr = sol.solution(A, B, C, D);
      System.out.println(String.format(format, A, B, C, D, timeStr));
    }
  }

  private static int[][] getTestCase()
  {
    int[][] testcase = 
    { 
      {1,8,3,2},     // Expected: 23:18
      {2,4,0,0},     // Expected: 20:40
      {3,0,7,0},     // Expected: 07:30
      {9,1,9,7}      // Expected: NOT POSSIBLE
    };
    
    return testcase;
  }
}
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e
