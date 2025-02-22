package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineIfTwoStringsAreCloseTest {
    @Test
    void test(){
        DetermineIfTwoStringsAreClose dI = new DetermineIfTwoStringsAreClose();
        assertTrue(dI.closeStrings("abc", "bca"));
        assertFalse(dI.closeStrings("a", "aa"));
        assertTrue(dI.closeStrings("cabbba", "abbccc"));
    }
}