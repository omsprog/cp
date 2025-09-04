package com.omsprog.algorithms.leetcode.medium.reverselinkedlistii;

import com.omsprog.algorithms.lc.ListNode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;

        ListNode ptr = new ListNode(0, head);
        ListNode ptrAux = ptr;
        int curPosition = 0;

        while(curPosition != left - 1) {
            ptr = ptr.next;
            ++curPosition;
        }

        int nodesToReverse = right - left;

        ListNode prev = null;
        ListNode curr = ptr.next;
        ListNode currAux = curr;
        ListNode next = null;

        for(int i = 0; i <= nodesToReverse; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ptr.next = prev; // connecting original list with reversed sublist
        currAux.next = next; // connecting last node of the reversed sublist with the remaining nodes

        return ptrAux.next;
    }
}
