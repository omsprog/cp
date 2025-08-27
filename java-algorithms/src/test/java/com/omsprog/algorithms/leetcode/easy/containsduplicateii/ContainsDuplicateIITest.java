package com.omsprog.algorithms.leetcode.easy.containsduplicateii;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {
    @Test
    void test() {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        assertTrue(containsDuplicateII.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        assertTrue(containsDuplicateII.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        assertFalse(containsDuplicateII.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}