package com.omsprog.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(111));
        assertFalse(PalindromeNumber.isPalindrome(112));
        assertFalse(PalindromeNumber.isPalindrome(986));
        assertTrue(PalindromeNumber.isPalindrome(1238321));
    }
}