package com.codility;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.monkey_jump_cross_river.Solution;
import com.codility.monkey_jump_cross_river.TestCase;

public class MonkeyJumoCrossRiverTest
{
    private TestCase[] testcaseAry;
    
    @Before
    public void generateTestCaseAry()
    {
        ArrayList<TestCase> aryList = new ArrayList<>();
        aryList.add(new TestCase(3, new int[] { 1, -1, 0, 2, 3, 5 }, 2));
        aryList.add(new TestCase(1, new int[] { 3, 2, 1 }, 3));
        aryList.add(new TestCase(3, new int[] { 1, 2, 3, 4, -1, -1, -1 }, -1));
        testcaseAry = aryList.toArray(new TestCase[aryList.size()]);
    }

    @Test
    public void testSolution()
    {
        Solution sol = new Solution();

        for (TestCase tc : testcaseAry)
        {
            int D = tc.getD();
            int[] A = tc.getNums();
            int expected = tc.getExpected();
            int actual = sol.solution(A, D);
            assertEquals(expected, actual);
        }
    }

}