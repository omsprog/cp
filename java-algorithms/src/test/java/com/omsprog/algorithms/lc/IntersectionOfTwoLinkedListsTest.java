package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {
    @Test
    void test() {
        IntersectionOfTwoLinkedLists iL = new IntersectionOfTwoLinkedLists();
        ListNode commonList = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode l1 = new ListNode(4, new ListNode(1, commonList));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(1, commonList)));

        assertEquals(commonList, iL.getIntersectionNode(l1, l2));
    }
}