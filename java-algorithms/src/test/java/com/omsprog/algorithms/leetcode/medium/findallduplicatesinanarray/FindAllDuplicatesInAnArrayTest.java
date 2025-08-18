package com.omsprog.algorithms.leetcode.medium.findallduplicatesinanarray;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInAnArrayTest {
    @Test
    void test() {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
        assertEquals(List.of(2,3), findAllDuplicatesInAnArray.findDuplicates(new int[] {4,3,2,7,8,2,3,1}));
        assertEquals(List.of(1), findAllDuplicatesInAnArray.findDuplicates(new int[] {1,1,2}));
        assertEquals(List.of(), findAllDuplicatesInAnArray.findDuplicates(new int[] {1}));
    }
}