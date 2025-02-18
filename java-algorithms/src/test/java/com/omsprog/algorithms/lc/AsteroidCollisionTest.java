package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {
    @Test
    void test() {
        AsteroidCollision aC = new AsteroidCollision();
        assertArrayEquals(new int[] {5,10}, aC.asteroidCollision(new int[] {5,10,-5}));
        assertArrayEquals(new int[] {}, aC.asteroidCollision(new int[] {8,-8}));
        assertArrayEquals(new int[] {10}, aC.asteroidCollision(new int[] {10,2,-5}));
    }
}