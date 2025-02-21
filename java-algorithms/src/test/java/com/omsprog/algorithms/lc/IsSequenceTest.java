package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSequenceTest {
    @Test
    void test() {
        IsSequence iS = new IsSequence();
        assertTrue(iS.isSubsequence("abc", "ahbgdc"));
        assertFalse(iS.isSubsequence("axc", "ahbgdc"));
    }
}