package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> mem = new HashSet<>();
        ListNode cNode = head;

        while(cNode != null) {
            if(mem.contains(cNode))
                return cNode;
            mem.add(cNode);
            cNode = cNode.next;
        }

        return null;
    }
}
