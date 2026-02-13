package com.omsprog.algorithms.leetcode.easy.intersectionofmultiplearrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfMultipleArraysTest {
    @Test
    void test() {
        IntersectionOfMultipleArrays intersectionOfMultipleArrays = new IntersectionOfMultipleArrays();
        assertEquals(List.of(3,4), intersectionOfMultipleArrays.intersection(new int[][] {{3,1,2,4,5}, {1,2,3,4}, {3,4,5,6}}));
        assertEquals(List.of(), intersectionOfMultipleArrays.intersection(new int[][] {{1,2,3}, {4,5,6}}));
    }
}