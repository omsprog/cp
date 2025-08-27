package com.omsprog.algorithms.leetcode.easy.movezeroes.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesQueueTest {
    @Test
    void test() {
        MoveZeroesQueue moveZeroesQueue = new MoveZeroesQueue();
        int[] arr1 = new int[] {0,1,0,3,12};
        moveZeroesQueue.moveZeroes(arr1);
        assertArrayEquals(new int[] {1,3,12,0,0}, arr1);
        int[] arr2 = new int[] {0};
        moveZeroesQueue.moveZeroes(arr2);
        assertArrayEquals(new int[] {0}, arr2);
    }
}