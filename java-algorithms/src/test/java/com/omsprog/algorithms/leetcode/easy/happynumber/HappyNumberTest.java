package com.omsprog.algorithms.leetcode.easy.happynumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {
    @Test
    void test() {
        HappyNumber happyNumber = new HappyNumber();
        assertTrue(happyNumber.isHappy(19));
        assertFalse(happyNumber.isHappy(2));
    }
}