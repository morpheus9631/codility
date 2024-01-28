package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.codility.shuffled_representation.Solution;
import com.codility.shuffled_representation.TestCase;

public class ShuffledRepresentationTest 
{
    private TestCase[] testcaseAry;

    @Before
    public void setupTestCase()
    {
        ArrayList<TestCase> aryList = new ArrayList<>();
        aryList.add(new TestCase(123456, 162534));
        aryList.add(new TestCase(130, 103));
        aryList.add(new TestCase(12345678, 18273645));
        aryList.add(new TestCase(1234567, 1726354));
        testcaseAry = aryList.toArray(new TestCase[aryList.size()]);
    }

    @Test
    public void testSolution()
    {
        Solution sol = new Solution();
        for (TestCase tc : testcaseAry)
        {
            int A = tc.getA();
            int expected = tc.getExpected();
            int actual = sol.solution(A);
            assertEquals(expected, actual);
        }
    }
    
}
