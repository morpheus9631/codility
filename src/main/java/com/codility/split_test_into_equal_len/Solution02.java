package com.codility.split_test_into_equal_len;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution02 implements Solution
{
    @Override
    public int solution(String S, int K)
    {
        String data = S;
        int maxLenght = K;
        Pattern p = Pattern.compile("\\G\\s*(.{1,"+maxLenght+"})(?=\\s|$)", Pattern.DOTALL);
        Matcher m = p.matcher(data);
        
        System.out.println("\r\nSubstrings:");
        int cnt = 0;
        while (m.find()) {
            cnt++;
            System.out.println(" "+m.group(1));
        }
        return cnt;
    }
}
