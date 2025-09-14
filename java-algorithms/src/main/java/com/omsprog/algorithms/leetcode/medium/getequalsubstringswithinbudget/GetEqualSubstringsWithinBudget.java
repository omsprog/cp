package com.omsprog.algorithms.leetcode.medium.getequalsubstringswithinbudget;

public class GetEqualSubstringsWithinBudget {
    private int calculateCost(char a, char b) {
        return Math.abs((a - 'a') - (b - 'a'));
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, right = 0;
        int maxLength = 0;
        int cost = 0;

        while(right < t.length()) {
            char sR = s.charAt(right);
            char tR = t.charAt(right);
            cost += calculateCost(sR, tR);
            while(cost > maxCost) {
                char sL = s.charAt(left);
                char tL = t.charAt(left);
                cost -= calculateCost(sL, tL);
                ++left;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            ++right;
        }

        return maxLength;
    }
}
