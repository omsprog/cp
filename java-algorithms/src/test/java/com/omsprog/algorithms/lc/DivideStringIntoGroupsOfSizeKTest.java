package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideStringIntoGroupsOfSizeKTest {
    @Test
    void test() {
        DivideStringIntoGroupsOfSizeK dS = DivideStringIntoGroupsOfSizeK();
        assertArrayEquals(new String[] { "abc","def","ghi" }, dS.divideString("abcdefghi", 3, "x"));
    }
}