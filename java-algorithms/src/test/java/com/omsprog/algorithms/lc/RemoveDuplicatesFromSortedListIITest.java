package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListIITest {
    @Test
    void test() {
        RemoveDuplicatesFromSortedListII rD = new RemoveDuplicatesFromSortedListII();
        assertTrue(
                TestUtil.isLinkedListValid(
                        rD.deleteDuplicates(TestUtil.buildLinkedList(new int[] {1,2,3,3,4,4,5})),
                        new int[] {1,2,5}
                )
        );

        assertTrue(
                TestUtil.isLinkedListValid(
                        rD.deleteDuplicates(TestUtil.buildLinkedList(new int[] {1,1,1,2,3})),
                        new int[] {2,3}
                )
        );
    }
}