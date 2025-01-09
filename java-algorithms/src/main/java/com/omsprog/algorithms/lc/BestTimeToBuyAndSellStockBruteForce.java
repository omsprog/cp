package com.omsprog.algorithms.lc;

public class BestTimeToBuyAndSellStockBruteForce {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int currentProfit = prices[j] - prices[i];
                if(currentProfit > profit)
                    profit = currentProfit;
            }
        }

        return profit;
    }
}
