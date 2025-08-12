package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {
    @Test
    void test() {
        SortList sortList = new SortList();
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,2,3,4}, sortList.sortList(TestUtil.buildLinkedList(new int[] {4,2,1,3}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {-1,0,3,4,5}, sortList.sortList(TestUtil.buildLinkedList(new int[] {-1,5,3,4,0}))));
    }
}