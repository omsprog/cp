package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    @Test
    void test() {
        MajorityElement mE = new MajorityElement();
        assertEquals(3, mE.majorityElement(new int[] {3,2,3}));
        assertEquals(2, mE.majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}