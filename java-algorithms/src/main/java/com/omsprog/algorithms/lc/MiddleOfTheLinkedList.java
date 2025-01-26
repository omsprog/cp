package com.omsprog.algorithms.lc;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int listLength = 0;
        ListNode targetNode = head;

        while(head != null) {
            ++listLength;
            head = head.next;
        }

        int indexOfTheMiddleNode = (listLength / 2) + 1;

        for(int i = 1; i != indexOfTheMiddleNode; i++)
            targetNode = targetNode.next;

        return targetNode;
    }
}
