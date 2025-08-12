package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    void test() {
        GroupAnagrams gA = new GroupAnagrams();
        assertEquals(3, gA.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}).size());
        assertEquals(1, gA.groupAnagrams(new String[] {""}).size());
    }
}