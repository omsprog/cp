package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateFromSortedListTest {
    @Test
    void test() {

        RemoveDuplicateFromSortedList rD = new RemoveDuplicateFromSortedList();
        rD.deleteDuplicates(new ListNode(1,
                                new ListNode(1,
                                        new ListNode(2))));
    }
}