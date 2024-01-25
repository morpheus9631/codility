package com.codility.count_visible_nodes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountVisibleNodesTest 
{
    private TestCase01 test_case01 = new TestCase01();
    private TestCase02 test_case02 = new TestCase02();

    private TestCase[] testcaseAry = { 
        test_case01, test_case02
    };

    @Test
    public void test()
    {
        Solution sol = new Solution01();

        for (TestCase testcase : testcaseAry)
        {
            Tree tree  = testcase.getCase();
            int actual = testcase.getReturn(); 
            int result = sol.solution(tree);
            assertEquals(actual, result); 
        }
    }
}
