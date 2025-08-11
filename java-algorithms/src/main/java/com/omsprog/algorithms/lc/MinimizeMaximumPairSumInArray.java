package com.omsprog.algorithms.lc;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int maximum = 0;

        while(left < right) {
            maximum = Math.max(maximum, nums[left] + nums[right]);
            ++left;
            --right;
        }

        return maximum;
    }
}
