package com.omsprog.algorithms.lc;

public class LongestSubarrayOf1AfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int max = 0;
        int countZ = 0;

        while(r < nums.length) {
            int n = nums[r];

            if(n == 0)
                ++countZ;

            if(countZ > 1) {
                while(countZ > 1) { // shrink window
                    n = nums[l];
                    if(n == 0)
                        --countZ;
                    ++l;
                }
            }

            ++r;
            max = Math.max(max, r - l - 1); // decreasing 1 because the removed element
        }

        return max;
    }
}
