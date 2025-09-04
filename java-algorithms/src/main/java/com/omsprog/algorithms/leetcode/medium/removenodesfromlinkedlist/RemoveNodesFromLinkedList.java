package com.omsprog.algorithms.leetcode.medium.removenodesfromlinkedlist;

import com.omsprog.algorithms.lc.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();

        while(head != null) {
            stack.push(head.val);

            head = head.next;
        }

        ListNode newHead = null;

        int max = stack.peek();

        while(!stack.isEmpty()) {
            int currentVal = stack.pop();
            if(currentVal >= max) {
                max = currentVal;
                ListNode newNode = new ListNode(currentVal);
                if(newHead == null) {
                    newHead = newNode;
                } else {
                    newNode.next = newHead;
                    newHead = newNode;
                }
            }
        }

        return newHead;
    }
}
