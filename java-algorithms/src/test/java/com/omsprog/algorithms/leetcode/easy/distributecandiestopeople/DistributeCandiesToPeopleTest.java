package com.omsprog.algorithms.leetcode.easy.distributecandiestopeople;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributeCandiesToPeopleTest {
    @Test
    void test() {
        DistributeCandiesToPeople dCTP = new DistributeCandiesToPeople();
        assertArrayEquals(new int[] {1,2,3,1}, dCTP.distributeCandies(7,4));
        assertArrayEquals(new int[] {5,2,3}, dCTP.distributeCandies(10,3));
    }
}