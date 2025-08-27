package com.omsprog.algorithms.leetcode.easy.palindromenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    @Test
    void test() {
        PalindromeNumber pN = new PalindromeNumber();
        assertTrue(pN.isPalindrome(121));
        assertFalse(pN.isPalindrome(-121));
        assertFalse(pN.isPalindrome(10));
    }
}