package com.omsprog.algorithms.leetcode.medium.mergenodesinbetweenzeros;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeNodesinBetweenZerosTest {
    @Test
    void test() {
        MergeNodesinBetweenZeros mergeNodesinBetweenZeros = new MergeNodesinBetweenZeros();
        assertTrue(TestUtil.isLinkedListValid(new int[] {4,11}, mergeNodesinBetweenZeros.mergeNodes(TestUtil.buildLinkedList(new int[] {0,3,1,0,4,5,2,0}))));
        assertTrue(TestUtil.isLinkedListValid(new int[] {1,3,4}, mergeNodesinBetweenZeros.mergeNodes(TestUtil.buildLinkedList(new int[] {0,1,0,3,0,2,2,0}))));
    }
}