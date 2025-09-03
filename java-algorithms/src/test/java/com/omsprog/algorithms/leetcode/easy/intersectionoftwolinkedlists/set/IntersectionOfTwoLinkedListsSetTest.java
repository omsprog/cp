package com.omsprog.algorithms.leetcode.easy.intersectionoftwolinkedlists.set;

import com.omsprog.algorithms.lc.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsSetTest {
    @Test
    void test() {
        IntersectionOfTwoLinkedListsSet intersection = new IntersectionOfTwoLinkedListsSet();
        ListNode commonList = new ListNode(77, new ListNode(89, new ListNode(88)));
        ListNode head1 = new ListNode(45, new ListNode(1, new ListNode(3, commonList)));
        ListNode head2 = new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, commonList))));

        assertEquals(commonList, intersection.getIntersectionNode(head1, head2));
    }
}