package com.omsprog.algorithms.lc;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        int left = 0;
        int right = s.length() - 1;
        int result = 0;
        int leftBalance = 0;
        int rightBalance = 0;

        while(left < right) {
            while(true) {
                if(left == right) return result;
                leftBalance += (s.charAt(left) == '[') ? 1 : -1;
                if(leftBalance < 0) break;
                ++left;
            }

            while(true) {
                if(left == right) return result;
                rightBalance += (s.charAt(right) == ']') ? 1 : -1;
                if(rightBalance < 0) break;
                --right;
            }
            ++result;
            leftBalance = 1;
            rightBalance = 1;
            ++left;
            --right;
        }

        return result;
    }
}
