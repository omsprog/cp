package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfPhoneNumberTest {
    @Test
    void test() {
        LetterCombinationsOfPhoneNumber letterCombinations = new LetterCombinationsOfPhoneNumber();
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), letterCombinations.letterCombinations("23"));
        assertEquals(List.of("a","b","c"), letterCombinations.letterCombinations("2"));
    }
}