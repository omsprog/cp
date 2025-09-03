package com.omsprog.algorithms.leetcode.easy.palindromelinkedlist.fastandslow;

import com.omsprog.algorithms.lc.ListNode;

public class PalindromeLinkedListFastAndSlow {
    private ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        // [1 -> 2 -> null]    fast == null -> even
        // [1 -> 2 -> 3 -> null]  fast.next == null -> odd
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null) // odd list
            slow = slow.next;

        ListNode reversedList = reverseList(slow);

        while(reversedList != null) {
            if(reversedList.val != head.val)
                return false;
            reversedList = reversedList.next;
            head = head.next;
        }

        return true;
    }
}
