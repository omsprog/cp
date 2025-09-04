package com.omsprog.algorithms.leetcode.easy.middleofthelinkedlist.count;

import com.omsprog.algorithms.lc.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListCountTest {
    @Test
    void test() {
        MiddleOfTheLinkedListCount middleOfTheLinkedListCount = new MiddleOfTheLinkedListCount();
        ListNode middleNodeNode = new ListNode(5, new ListNode(2, new ListNode(4)));
        ListNode list = new ListNode(1, new ListNode(8, middleNodeNode));
        assertEquals(middleNodeNode, middleOfTheLinkedListCount.middleNode(list));
    }
}