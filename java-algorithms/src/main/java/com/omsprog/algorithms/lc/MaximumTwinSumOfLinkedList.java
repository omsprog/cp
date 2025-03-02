package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumTwinSumOfLinkedList {
    public int pairSum(ListNode head) {
        int count = 0;
        int max = 0;
        ListNode p = head;
        while(p != null) {
            ++count;
            p = p.next;
        }

        int middlePoint = count / 2;
        p = head;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < middlePoint; i++) {
            stack.push(p.val);
            p = p.next;
        }

        while(p != null) {
            int v1 = stack.pop();
            int v2 = p.val;
            max = Math.max(max, v1 + v2);
            p = p.next;
        }

        return max;
    }
}