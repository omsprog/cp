package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSymmetricIntegersTest {
    @Test
    void test() {
        CountSymmetricIntegers cS = new CountSymmetricIntegers();
        assertEquals(9, cS.countSymmetricIntegers(1,100));
        assertEquals(4, cS.countSymmetricIntegers(1200,1230));
    }
}