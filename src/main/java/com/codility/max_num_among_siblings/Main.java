package com.codility.max_num_among_siblings;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Find maximum number among siblings.\r\n");
        
        Solution sol = new Solution();
        String format = "N = %d, return %d\r\n";

        int N = 213;
        int res = sol.solution(N);
        System.out.println(String.format(format, N, res));
        
        N = 553;
        res = sol.solution(N);
        System.out.println(String.format(format, N, res));
    }

}
