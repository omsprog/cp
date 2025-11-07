package com.omsprog.algorithms.leetcode.easy.maximumnumberofwordsyoucantype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWordsYouCanTypeTest {
    @Test
    void test() {
        MaximumNumberOfWordsYouCanType mNOWYCT = new MaximumNumberOfWordsYouCanType();
        assertEquals(1, mNOWYCT.canBeTypedWords("hello world", "ad"));
        assertEquals(1, mNOWYCT.canBeTypedWords("leet code", "lt"));
        assertEquals(0, mNOWYCT.canBeTypedWords("leet code", "e"));
    }
}