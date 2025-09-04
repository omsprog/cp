package com.omsprog.algorithms.leetcode.medium.doubleanumberrepresentedasalinkedlist;

import com.omsprog.algorithms.lc.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleANumberRepresentedAsALinkedList {
    public ListNode doubleIt(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();

        // pushing values into stack
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode newHead = null;
        boolean carry = false;

        while(!stack.isEmpty()) {
            int val = stack.pop();
            int doubleVal = val * 2;
            if(carry)
                doubleVal = doubleVal + 1;
            if(doubleVal >= 10) {
                carry = true;
                doubleVal = doubleVal - 10;
            } else
                carry = false;

            ListNode newNode = new ListNode(doubleVal);
            if(newHead == null) {
                newHead = newNode;
            } else {
                newNode.next = newHead;
                newHead = newNode;
            }
        }

        if(carry) {
            ListNode newNode = new ListNode(1);
            newNode.next = newHead;
            newHead = newNode;
        }

        return newHead;
    }
}
