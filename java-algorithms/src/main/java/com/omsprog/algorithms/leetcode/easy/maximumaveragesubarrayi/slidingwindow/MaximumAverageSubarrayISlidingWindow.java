package com.omsprog.algorithms.leetcode.easy.maximumaveragesubarrayi.slidingwindow;

public class MaximumAverageSubarrayISlidingWindow {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0, left = 0, right = 0;
        int maxSum = Integer.MIN_VALUE;

        while(right < nums.length) {
            sum += nums[right];
            if(right - left + 1 == k) {
                if(sum > maxSum)
                    maxSum = sum;
                int firstVal = nums[left];
                sum -= firstVal;
                ++left;
            }
            ++right;
        }

        return (double)maxSum / k;
    }
}
