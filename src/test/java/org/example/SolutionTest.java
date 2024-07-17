package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void majorityElementTest() {
        Solution solution = new Solution();
        assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
        assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
        assertEquals(1, solution.majorityElement(new int[]{1,1,1,1,1,1,1}));
        assertEquals(9, solution.majorityElement(new int[]{9,9,1,1,1,9,9}));
    }

}