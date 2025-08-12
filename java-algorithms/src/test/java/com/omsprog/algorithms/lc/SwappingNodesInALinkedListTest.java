package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SwappingNodesInALinkedListTest {
    @Test
    void test() {
        SwappingNodesInALinkedList sN = new SwappingNodesInALinkedList();
        assertTrue(TestUtil.isLinkedListValid(
                sN.swapNodes(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}), 2),
                new int[] {1,4,3,2,5}
        ));

        assertTrue(TestUtil.isLinkedListValid(
                sN.swapNodes(TestUtil.buildLinkedList(new int[] {7,9,6,6,7,8,3,0,9,5}), 5),
                new int[] {7,9,6,6,8,7,3,0,9,5}
        ));
    }
}