package com.omsprog.algorithms.leetcode.easy.sortthepeople;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortThePeopleTest {
    @Test
    void test() {
        SortThePeople sTP = new SortThePeople();
        assertArrayEquals(new String[] {"Mary","Emma","John"}, sTP.sortPeople(new String[] {"Mary","John","Emma"}, new int[] {180,165,170}));
        assertArrayEquals(new String[] {"Bob","Alice","Bob"}, sTP.sortPeople(new String[] {"Alice","Bob","Bob"}, new int[] {155,185,150}));
    }
}