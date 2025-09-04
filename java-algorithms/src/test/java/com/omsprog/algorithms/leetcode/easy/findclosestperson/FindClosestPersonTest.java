package com.omsprog.algorithms.leetcode.easy.findclosestperson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestPersonTest {
    @Test
    void test() {
        FindClosestPerson findClosestPerson = new FindClosestPerson();
        assertEquals(1, findClosestPerson.findClosest(2, 7, 4));
        assertEquals(2, findClosestPerson.findClosest(2, 5, 6));
        assertEquals(0, findClosestPerson.findClosest(1, 5, 3));
    }
}