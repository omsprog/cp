package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {
    @Test
    void test() {
        BaseballGame bG = new BaseballGame();
        assertEquals(30, bG.calPoints(new String[] {"5","2","C","D","+"}));
        assertEquals(27, bG.calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
        assertEquals(0, bG.calPoints(new String[] {"1","C"}));
    }
}