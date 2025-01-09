package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingWordsWithGivenPrefixTest {
    @Test
    void test() {
        CountingWordsWithGivenPrefix cW = new CountingWordsWithGivenPrefix();
        assertEquals(2, cW.prefixCount(new String[] { "pay","attention","practice","attend" }, "at"));
    }
}