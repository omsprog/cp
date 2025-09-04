package com.omsprog.algorithms.leetcode.easy.jewelsandstones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {
    @Test
    void test() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        assertEquals(3, jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, jewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}