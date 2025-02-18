package com.omsprog.algorithms.lc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseVowelsOfStringTest {
    @Test
    void test() {
        ReverseVowelsOfString rV = new ReverseVowelsOfString();
        assertEquals("AceCreIm", rV.reverseVowels("IceCreAm"));
        assertEquals("leotcede", rV.reverseVowels("leetcode"));
    }
}