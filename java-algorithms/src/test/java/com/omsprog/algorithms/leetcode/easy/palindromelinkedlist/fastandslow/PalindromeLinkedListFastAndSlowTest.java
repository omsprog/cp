package com.omsprog.algorithms.leetcode.easy.palindromelinkedlist.fastandslow;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListFastAndSlowTest {
    @Test
    void test() {
        PalindromeLinkedListFastAndSlow palindromeLinkedList = new PalindromeLinkedListFastAndSlow();
        assertTrue(palindromeLinkedList.isPalindrome(TestUtil.buildLinkedList(new int[] {1,2,2,1})));
        assertFalse(palindromeLinkedList.isPalindrome(TestUtil.buildLinkedList(new int[] {1,2})));
    }
}