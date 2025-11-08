package com.omsprog.algorithms.leetcode.easy.checkifdigitsareequalinstringafteroperationsi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfDigitsAreEqualInStringAfterOperationsITest {
    @Test
    void test() {
        CheckIfDigitsAreEqualInStringAfterOperationsI cIDAEISAO = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(cIDAEISAO.hasSameDigits("3902"));
        assertFalse(cIDAEISAO.hasSameDigits("34789"));
    }
}