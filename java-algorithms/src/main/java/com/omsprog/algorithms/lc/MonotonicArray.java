package com.omsprog.algorithms.lc;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        int p = nums[0];
        int f = 0; // 0 -> not set, 1 -> increasing, 2 -> decreasing

        for(int i = 1; i < nums.length; i++) {
            int n = nums[i];

            if(f == 0) {
                if(n > p) f = 1;
                else if (n < p) f = 2;
            } else {
                if(n > p && f == 2) return false;
                else if(n < p && f == 1) return false;
            }
            p = nums[i];
        }

        return true;
    }
}
