package com.omsprog.algorithms.lc;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sumOfNums = 0;
        int totalSum = 0;

        for(int i = 0; i < nums.length; i++) {
            totalSum += i;
            sumOfNums += nums[i];
        }

        totalSum += nums.length;

        return totalSum - sumOfNums;
    }
}
