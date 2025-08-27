package com.omsprog.algorithms.leetcode.easy.countthedigitsthatdivideanumber;

public class CountTheDigitsThatDivideANumber {
    public int countDigits(int num) {
        int res = 0;
        int original = num;
        while(num > 0) {
            int digit = num % 10;
            if(original % digit == 0) ++res;
            num = num / 10;
        }

        return res;
    }
}
