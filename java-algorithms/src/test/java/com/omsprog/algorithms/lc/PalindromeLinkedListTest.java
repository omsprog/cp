package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    @Test
    void test() {
        PalindromeLinkedList pLL = new PalindromeLinkedList();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
        assertEquals(true, pLL.isPalindrome(l1));

        ListNode l2 = new ListNode(1, new ListNode(2, null));
        assertEquals(false, pLL.isPalindrome(l2));
    }
}