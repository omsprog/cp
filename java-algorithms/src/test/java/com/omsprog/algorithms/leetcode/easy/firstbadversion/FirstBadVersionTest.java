package com.omsprog.algorithms.leetcode.easy.firstbadversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {
    @Test
    void test() {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        assertEquals(8, firstBadVersion.firstBadVersion(10));
    }
}