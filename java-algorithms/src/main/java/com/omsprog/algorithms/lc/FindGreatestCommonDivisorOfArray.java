package com.omsprog.algorithms.lc;

public class FindGreatestCommonDivisorOfArray {
    public int findGCD(int[] nums) {
        int smallest = nums[0];
        int greatest = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < smallest)
                smallest = nums[i];
            if(nums[i] > greatest)
                greatest = nums[i];
        }

        // calculate the GCD
        int a = greatest;
        int b = smallest;
        int r = a % b;

        while(r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        return b;
    }
}
