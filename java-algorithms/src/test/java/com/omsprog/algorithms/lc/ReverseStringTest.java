package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void test() {
        ReverseString rS = new ReverseString();
        char[] stringToReverse = new char[] {'h','e','l','l','o'};
        rS.reverseString(stringToReverse);
        assertArrayEquals(new char[] {'o','l','l','e','h'}, stringToReverse);
    }
}