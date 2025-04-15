package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        Set<ListNode> nodesInA = new HashSet<>();

        // Store nodes in Set
        while(pointerA != null) {
            nodesInA.add(pointerA);
            pointerA = pointerA.next;
        }

        ListNode pointerB = headB;
        while(pointerB != null) {
            if(nodesInA.contains(pointerB))
                return pointerB;
            pointerB = pointerB.next;
        }

        return null;
    }
}
