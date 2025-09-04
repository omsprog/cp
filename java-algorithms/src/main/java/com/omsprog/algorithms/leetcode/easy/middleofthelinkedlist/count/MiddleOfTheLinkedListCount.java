package com.omsprog.algorithms.leetcode.easy.middleofthelinkedlist.count;

import com.omsprog.algorithms.lc.ListNode;

public class MiddleOfTheLinkedListCount {
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
