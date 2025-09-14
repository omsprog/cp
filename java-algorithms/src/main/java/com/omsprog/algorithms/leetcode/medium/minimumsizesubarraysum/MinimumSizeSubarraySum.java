package com.omsprog.algorithms.leetcode.medium.minimumsizesubarraysum;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, sum = 0, minLength = Integer.MAX_VALUE;

        while(right < nums.length) {
            sum += nums[right];
            while(sum >= target) {
                minLength = Math.min(right - left  + 1, minLength);
                sum -= nums[left];
                left++;
            }
            ++right;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
