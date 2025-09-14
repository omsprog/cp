package com.omsprog.algorithms.leetcode.medium.fruitintobaskets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitIntoBasketsTest {
    @Test
    void test() {
        FruitIntoBaskets fIB = new FruitIntoBaskets();
        assertEquals(3, fIB.totalFruit(new int[] {1,2,1}));
        assertEquals(3, fIB.totalFruit(new int[] {0,1,2,2}));
        assertEquals(4, fIB.totalFruit(new int[] {1,2,3,2,2}));
    }
}