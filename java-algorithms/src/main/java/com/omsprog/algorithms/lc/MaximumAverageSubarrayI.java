package com.omsprog.algorithms.lc;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        int pointerA = 0;
        int pointerB = k - 1; // nums [1,2,3,4], k = 4

        while(pointerB + 1 < nums.length) {
            ++pointerA;
            ++pointerB;
            sum = sum - nums[pointerA - 1] + nums[pointerB];
            if(sum > max)
                max = sum;
        }

        return (double) max / k;
    }
}
