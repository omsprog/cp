package com.omsprog.algorithms.leetcode.easy.intersectionoftwolinkedlists.listcombination;

import com.omsprog.algorithms.lc.ListNode;

public class IntersectionOfTwoLinkedListsCombination {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while(pointerA != pointerB) {
            pointerA = pointerA == null ? headB : pointerA.next;
            pointerB = pointerB == null ? headA : pointerB.next;
        }

        return pointerA;
    }
}
