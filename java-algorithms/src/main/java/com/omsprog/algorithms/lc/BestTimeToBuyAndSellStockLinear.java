package com.omsprog.algorithms.lc;

public class BestTimeToBuyAndSellStockLinear {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowest = prices[0];
        for(int i = 1; i < prices.length; i++) {
            int currentVal = prices[i];

            if(currentVal - lowest > profit)
                profit = currentVal - lowest;

            if(currentVal < lowest)
                lowest = currentVal;
        }

        return profit;
    }
}
