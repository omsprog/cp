package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        Map<Integer, ListNode> memory = new HashMap<>();
        ListNode pointer = head;
        int index = 0;
        while(pointer != null) {
            memory.put(index, pointer);
            pointer = pointer.next;
            ++index;
        }

        int indexA = k - 1;
        int indexB = index - k;

        ListNode nodeA = memory.get(indexA);
        ListNode nodeB = memory.get(indexB);
        int tmp = nodeB.val;
        nodeB.val = nodeA.val;
        nodeA.val = tmp;

        return head;
    }
}
