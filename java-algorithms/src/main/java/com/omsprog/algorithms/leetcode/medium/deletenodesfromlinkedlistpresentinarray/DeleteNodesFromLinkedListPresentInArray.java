package com.omsprog.algorithms.leetcode.medium.deletenodesfromlinkedlistpresentinarray;

import com.omsprog.algorithms.lc.ListNode;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodesFromLinkedListPresentInArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> memory = new HashSet<>();
        for(int num : nums)
            memory.add(num);

        ListNode dummyNode = new ListNode(0, head);
        ListNode current = dummyNode;

        while(current.next != null) {
            if(memory.contains(current.next.val))
                current.next = current.next.next;
            else
                current = current.next;
        }
        return dummyNode.next;
    }
}
