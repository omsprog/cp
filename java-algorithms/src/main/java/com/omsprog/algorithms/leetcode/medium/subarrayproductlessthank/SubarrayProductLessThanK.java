package com.omsprog.algorithms.leetcode.medium.subarrayproductlessthank;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0; // Edge case: since all elements are ≥ 1, no subarray can have a product less than k
        int product = 1;
        int left = 0, right = 0;
        int result = 0;

        while(right < nums.length) {
            int nR = nums[right];
            product = product * nR;
            while(product >= k) {
                int nL = nums[left];
                product = product / nL;
                ++left;
            }
            result = result + right - left + 1;
            ++right;
        }

        return result;
    }
}
