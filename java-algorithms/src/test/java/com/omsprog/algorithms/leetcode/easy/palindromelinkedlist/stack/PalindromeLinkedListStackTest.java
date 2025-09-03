package com.omsprog.algorithms.leetcode.easy.palindromelinkedlist.stack;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListStackTest {
    @Test
    void test() {
        PalindromeLinkedListStack palindromeLinkedListStack = new PalindromeLinkedListStack();
        assertTrue(palindromeLinkedListStack.isPalindrome(TestUtil.buildLinkedList(new int[] {1,2,2,1})));
        assertFalse(palindromeLinkedListStack.isPalindrome(TestUtil.buildLinkedList(new int[] {1,2})));
    }
}