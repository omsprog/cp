package com.omsprog.algorithms.leetcode.easy.validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    void test() {
        ValidPalindrome vP = new ValidPalindrome();
        assertTrue(vP.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(vP.isPalindrome("race a car"));
        assertTrue(vP.isPalindrome(" "));
    }
}