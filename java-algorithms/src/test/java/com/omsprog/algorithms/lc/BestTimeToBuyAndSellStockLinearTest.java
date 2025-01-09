package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockLinearTest {
    @Test
    void test() {
        BestTimeToBuyAndSellStockLinear bst = new BestTimeToBuyAndSellStockLinear();
        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        assertEquals(5, bst.maxProfit(prices));
    }
}