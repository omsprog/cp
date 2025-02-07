package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;

        ListNode first = head;
        ListNode second = head.next;

        Set<Integer> memory = new HashSet<>();

        memory.add(first.val);

        while(second != null) {
            if(memory.contains(second.val)) {
                first.next = second.next;
                second = second.next;
                continue;
            } else {
                memory.add(second.val);
                first = first.next;
                second = second.next;
            }
        }

        return head;
    }
}
