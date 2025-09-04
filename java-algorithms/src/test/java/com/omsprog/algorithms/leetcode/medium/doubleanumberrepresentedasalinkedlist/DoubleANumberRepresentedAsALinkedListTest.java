package com.omsprog.algorithms.leetcode.medium.doubleanumberrepresentedasalinkedlist;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleANumberRepresentedAsALinkedListTest {
    @Test
    void test() {
        DoubleANumberRepresentedAsALinkedList dANR = new DoubleANumberRepresentedAsALinkedList();
        assertTrue(TestUtil.isLinkedListValid(new int[] {3,7,8}, dANR.doubleIt(TestUtil.buildLinkedList(new int[] {1,8,9}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,9,9,8}, dANR.doubleIt(TestUtil.buildLinkedList(new int[] {9,9,9}))));
    }
}