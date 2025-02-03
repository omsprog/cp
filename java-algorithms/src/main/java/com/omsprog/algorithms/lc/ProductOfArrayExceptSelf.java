package com.omsprog.algorithms.lc;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // Building left array
        for(int i = 0; i < nums.length; i++) {
            if(i == 0)
                left[0] = nums[0];
            else
                left[i] = nums[i] * left[i - 1];
        }

        // Building right array
        for(int i = nums.length -1; i >= 0; i--) {
            if(i == nums.length -1)
                right[i] = nums[i];
            else
                right[i] = nums[i] * right[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            if(i == 0)
                nums[0] = right[1];
            else {
                if(i == nums.length - 1)
                    nums[i] = left[i - 1];
                else
                    nums[i] = left[i - 1] * right[i + 1];
            }
        }

        return nums;
    }
}
