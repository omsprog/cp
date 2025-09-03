package com.omsprog.algorithms.leetcode.easy.intersectionoftwolinkedlists.set;

import com.omsprog.algorithms.lc.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedListsSet {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> memory = new HashSet<>();
        while(headA != null) {
            memory.add(headA);
            headA = headA.next;
        }

        while(headB != null) {
            if(memory.contains(headB)) return headB;
            headB = headB.next;
        }

        return null;
    }
}
