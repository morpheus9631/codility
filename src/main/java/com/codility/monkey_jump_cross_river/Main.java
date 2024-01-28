package com.codility.monkey_jump_cross_river;

import java.util.Arrays;

public class Main {
        
    public static void main(String[] args)
    {
        System.out.println("Monkey jump cross river\r\n");
        
        Solution sol = new Solution();
        String format = "D = %d, A = %s\r\nReturn %d\r\n";
        
        TestCase tc = new TestCase( 3,
                                    new int[] { 1, -1, 0, 2, 3, 5 },
                                    2);
        int D = tc.getD();
        int[] A = tc.getNums();
        int result = sol.solution(A, D);
        System.out.println(String.format(format, D, Arrays.toString(A), result));
    }
}
