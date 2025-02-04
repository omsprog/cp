package com.omsprog.algorithms.lc;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int reached = 0;

        while(fast != null && fast.next != null) {
            if(fast == slow)
                ++reached;
            if(reached == 2)
                return true;

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
