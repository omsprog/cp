package com.omsprog.algorithms.leetcode.easy.calculatemoneyinleetcodebank;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int mondayCounter = 0;
        int nonMondayCounter = 0;
        int amount = 0;
        for(int i = 0; i < n; i++) {
            if(i % 7 == 0) {
                ++mondayCounter;
                nonMondayCounter = 0;
            }
            amount = amount + mondayCounter + nonMondayCounter;
            ++nonMondayCounter;
        }
        return amount;
    }
}
