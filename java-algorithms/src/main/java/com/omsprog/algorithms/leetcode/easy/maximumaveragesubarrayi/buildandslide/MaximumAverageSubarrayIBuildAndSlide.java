package com.omsprog.algorithms.leetcode.easy.maximumaveragesubarrayi.buildandslide;

public class MaximumAverageSubarrayIBuildAndSlide {
    public double findMaxAverage(int[] nums, int k) {
        // build a window of size 'k'
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        int left = 0, right = k - 1;

        // slide the window
        while(right + 1 < nums.length) {
            sum -= nums[left];
            ++left;
            ++right;
            sum += nums[right];
            if(sum > max)
                max = sum;
        }

        return (double) max / k;
    }
}
