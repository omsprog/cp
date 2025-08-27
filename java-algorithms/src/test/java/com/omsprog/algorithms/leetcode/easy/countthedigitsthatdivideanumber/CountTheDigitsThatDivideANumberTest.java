package com.omsprog.algorithms.leetcode.easy.countthedigitsthatdivideanumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTheDigitsThatDivideANumberTest {
    @Test
    void test() {
        CountTheDigitsThatDivideANumber cDTD = new CountTheDigitsThatDivideANumber();
        assertEquals(1, cDTD.countDigits(7));
        assertEquals(2, cDTD.countDigits(121));
        assertEquals(4, cDTD.countDigits(1248));
    }
}