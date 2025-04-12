package com.omsprog.algorithms.lc;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int consecutiveSum = 0;
        int maxSum = nums[0];

        for(int num : nums) {
            consecutiveSum += num;

            if(consecutiveSum < 1) {
                consecutiveSum = 0;
                maxSum = Math.max(maxSum, num);
            } else
                maxSum = Math.max(maxSum, consecutiveSum);
        }

        return maxSum;
    }
}
