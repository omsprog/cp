package com.omsprog.algorithms.lc;

public class ApplyOperationsToAnArray {
    public int[] applyOperations(int[] nums) {
        int[] newArray = new int[nums.length];
        int nonZeroCounter = 0;
        for(int i = 0; i < nums.length; i++) {

            if(i != nums.length -1)
                if(nums[i] == nums[i + 1]) {
                    nums[i] = nums[i] * 2;
                    nums[i + 1] = 0;
                }

            if(nums[i] != 0) {
                newArray[nonZeroCounter] = nums[i];
                ++nonZeroCounter;
            }
        }

        for(int j = nonZeroCounter; j < nums.length; j++) {
            newArray[j] = 0;
        }

        return newArray;
    }
}
