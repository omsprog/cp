package com.omsprog.algorithms.leetcode.easy.firstuniquecharacterinastring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {
    @Test
    void test() {
        FirstUniqueCharacterInAString fUCIS = new FirstUniqueCharacterInAString();
        assertEquals(0, fUCIS.firstUniqChar("leetcode"));
        assertEquals(2, fUCIS.firstUniqChar("loveleetcode"));
        assertEquals(-1, fUCIS.firstUniqChar("aabb"));
    }
}