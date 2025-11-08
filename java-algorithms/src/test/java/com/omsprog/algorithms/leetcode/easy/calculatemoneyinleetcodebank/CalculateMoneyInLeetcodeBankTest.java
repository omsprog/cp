package com.omsprog.algorithms.leetcode.easy.calculatemoneyinleetcodebank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyInLeetcodeBankTest {
    @Test
    void test() {
        CalculateMoneyInLeetcodeBank cMILB = new CalculateMoneyInLeetcodeBank();
        assertEquals(10, cMILB.totalMoney(4));
        assertEquals(37, cMILB.totalMoney(10));
        assertEquals(96, cMILB.totalMoney(20));
    }
}