package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStarsTest {
    @Test
    void test() {
        RemoveStars rS = new RemoveStars();
        assertEquals("lecoe", rS.removeStars("leet**cod*e"));
        assertEquals("", rS.removeStars("erase*****"));
    }
}