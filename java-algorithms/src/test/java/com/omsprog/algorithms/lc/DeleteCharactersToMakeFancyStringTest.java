package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteCharactersToMakeFancyStringTest {
    @Test
    void test() {
        DeleteCharactersToMakeFancyString d = new DeleteCharactersToMakeFancyString();
        assertEquals("leetcode", d.makeFancyString("leeetcode"));
        assertEquals("aabaa", d.makeFancyString("aaabaaaa"));
    }
}