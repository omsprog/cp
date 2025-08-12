package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    @Test
    void test() {
        RotateList rotateList = new RotateList();
        ListNode list1 = rotateList.rotateRight(TestUtil.buildLinkedList(new int[] {1,2,3,4,5}), 2);
        assertTrue(TestUtil.isLinkedListValid(new int[] {4,5,1,2,3}, list1));

        ListNode list2 = rotateList.rotateRight(TestUtil.buildLinkedList(new int[] {0,1,2}), 4);
        assertTrue(TestUtil.isLinkedListValid(new int[] {2,0,1}, list2));
    }
}