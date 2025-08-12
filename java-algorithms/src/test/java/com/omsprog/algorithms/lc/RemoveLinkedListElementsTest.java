package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {
    @Test
    void test() {
        RemoveLinkedListElements rL = new RemoveLinkedListElements();
        ListNode l1 = TestUtil.buildLinkedList(new int[] {1,2,6,3,4,5,6});
        ListNode l1r = rL.removeElements(l1, 6);
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,2,3,4,5}, l1r));
    }
}