package com.omsprog.algorithms.lc;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int pointerA = 0;
        int pointerB = nums.length - 1;
        int operations = 0;

        while(pointerA < pointerB) {
            int valA = nums[pointerA];
            int valB = nums[pointerB];
            int localSum = valA + valB;

            if(localSum == k) {
                ++pointerA;
                --pointerB;
                ++operations;
            } else if (localSum < k)
                ++pointerA;
            else
                --pointerB;
        }

        return operations;
    }
}
