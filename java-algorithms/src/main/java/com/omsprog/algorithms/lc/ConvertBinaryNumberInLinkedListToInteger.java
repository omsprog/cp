package com.omsprog.algorithms.lc;

public class ConvertBinaryNumberInLinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}