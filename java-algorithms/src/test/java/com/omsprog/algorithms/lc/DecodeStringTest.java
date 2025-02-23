package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {
    @Test
    void test() {
        DecodeString eR = new DecodeString();
        assertEquals("aaabcbc", eR.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", eR.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", eR.decodeString("2[abc]3[cd]ef"));
    }
}