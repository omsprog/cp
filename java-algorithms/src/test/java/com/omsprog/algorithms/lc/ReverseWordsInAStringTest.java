package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReverseWordsInAStringTest {
    @Test
    void test() {
        ReverseWordsInAString rW = new ReverseWordsInAString();
        assertEquals("blue is sky the", rW.reverseWords("the sky is blue"));
        assertEquals("world hello", rW.reverseWords("  hello world  "));
        assertEquals("example good a", rW.reverseWords("a good   example"));
    }
}