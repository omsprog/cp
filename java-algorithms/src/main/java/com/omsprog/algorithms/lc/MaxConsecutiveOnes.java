package com.omsprog.algorithms.lc;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNumber = 0;
        int consecutiveOnes = 0;

        for(int num : nums) {
            if(num == 1) {
                ++consecutiveOnes;
                maxNumber = Math.max(maxNumber, consecutiveOnes);
            } else
                consecutiveOnes = 0;
        }

        return maxNumber;
    }
}
