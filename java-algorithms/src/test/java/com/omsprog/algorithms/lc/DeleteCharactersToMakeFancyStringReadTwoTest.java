package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteCharactersToMakeFancyStringReadTwoTest {
    @Test
    void test() {
        DeleteCharactersToMakeFancyStringReadTwo d = new DeleteCharactersToMakeFancyStringReadTwo();
        assertEquals("leetcode", d.makeFancyString("leeetcode"));
        assertEquals("aabaa", d.makeFancyString("aaabaaaa"));
    }
}