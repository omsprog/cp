package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingSpacesToAStringTest {
    @Test
    void test() {
        AddingSpacesToAString aS = new AddingSpacesToAString();
        assertEquals("Leetcode Helps Me Learn", aS.addSpaces("LeetcodeHelpsMeLearn", new int[] {8,13,15}));
        assertEquals("i code in py thon", aS.addSpaces("icodeinpython", new int[] {1,5,7,9}));
        assertEquals(" s p a c i n g", aS.addSpaces("spacing", new int[] {0,1,2,3,4,5,6}));
    }
}