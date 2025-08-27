package com.omsprog.algorithms.leetcode.easy.adddigits;

public class AddDigits {
    private int sumDigits(int num) {
        int res = 0;

        while(num > 0) {
            int digit = num % 10;
            res = res + digit;
            num = num / 10;
        }

        return res;
    }

    public int addDigits(int num) {
        while(num > 9) {
            num = sumDigits(num);
        }
        return num;
    }
}
