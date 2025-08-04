package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {
    @Test
    void test() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
        assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
    }
}