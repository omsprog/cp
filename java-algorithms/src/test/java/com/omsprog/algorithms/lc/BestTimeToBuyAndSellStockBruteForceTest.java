package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockBruteForceTest {
    @Test
    void test() {
        BestTimeToBuyAndSellStockBruteForce bst = new BestTimeToBuyAndSellStockBruteForce();
        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        assertEquals(5, bst.maxProfit(prices));
    }
}