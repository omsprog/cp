package com.omsprog.algorithms.lc;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) return 0;

        int[] leftA = new int[nums.length];
        int[] rightA = new int[nums.length];

        // leftA
        for(int i = 0; i < nums.length; i++) {
            if(i == 0)
                leftA[0] = nums[0];
            else
                leftA[i] = nums[i] + leftA[i - 1];
        }

        // rightA
        for(int i = nums.length - 1; i >= 0; i--) {
            if(i == nums.length - 1)
                rightA[i] = nums[i];
            else
                rightA[i] = nums[i] + rightA[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            int left = i == 0 ? 0 : leftA[i - 1];
            int right = i == nums.length - 1 ? 0 : rightA[i + 1];

            if(left == right)
                return i;
        }

        return -1;
    }
}
