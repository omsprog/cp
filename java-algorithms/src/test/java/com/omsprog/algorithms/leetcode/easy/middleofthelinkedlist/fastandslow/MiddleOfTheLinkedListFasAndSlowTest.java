package com.omsprog.algorithms.leetcode.easy.middleofthelinkedlist.fastandslow;

import com.omsprog.algorithms.lc.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfTheLinkedListFasAndSlowTest {
    @Test
    void test() {
        MiddleOfTheLinkedListFasAndSlow middleOfTheLinkedList = new MiddleOfTheLinkedListFasAndSlow();
        ListNode middleNodeNode = new ListNode(5, new ListNode(2, new ListNode(4)));
        ListNode list = new ListNode(1, new ListNode(8, middleNodeNode));
        assertEquals(middleNodeNode, middleOfTheLinkedList.middleNode(list));
    }
}