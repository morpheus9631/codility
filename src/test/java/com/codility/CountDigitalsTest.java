<<<<<<< HEAD
package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.count_digitals.Solution;
import com.codility.count_digitals.TestCase;

public class CountDigitalsTest
{
    private TestCase[] testcaseAry;
    
    @Before
    public void setupTestCase()
    {
        testcaseAry = new TestCase[4];
        testcaseAry[0] = new TestCase(1, 2);
        testcaseAry[1] = new TestCase(2, 2);
        testcaseAry[2] = new TestCase(5, 3);
        testcaseAry[3] = new TestCase(6, 3);
    }
=======

package com.codility;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.codility.count_digitals.Solution01;

public class CountDigitalsTest
{
    private int[][] testcaseAry = {
        { 1, 2 }, { 2, 2 }, { 3, 2 },
        { 4, 2 }, { 5, 3 }, { 6, 3 }
    };
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e

    @Test
    public void testCountDigital()
    {
<<<<<<< HEAD
        Solution sol = new Solution();

        for (TestCase tc: testcaseAry)
        {
            int N = tc.getN();
            int expected = tc.getExpected();
            int actual = sol.solution(N);
            assertEquals(expected, actual);
=======
        Solution01 sol = new Solution01();

        for (int[] testcase : testcaseAry)
        {
            int n = testcase[0];
            int actual = testcase[1];
            int result = sol.solution(n);
            assertEquals(actual, result);
>>>>>>> c80f9a401d9e6a4e6e781885149661bcf7225d8e
        }
    }
}