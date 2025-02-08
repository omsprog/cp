package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    @Test
    void test() {
        ReverseLinkedList rL = new ReverseLinkedList();
        ListNode reversedList = rL.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
        while(reversedList != null) {
            System.out.println(reversedList.val + " ");
            reversedList = reversedList.next;
        }

    }
}