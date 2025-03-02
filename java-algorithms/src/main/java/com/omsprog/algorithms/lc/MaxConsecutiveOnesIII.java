package com.omsprog.algorithms.lc;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int pA = 0;
        int pB = 0;
        int max = 0;
        int countZ = 0;

        while(pB < nums.length) {
            int n = nums[pB]; // upcoming number

            if(n == 0) ++countZ;

            if(countZ > k) {
                while(countZ > k){ // shrink window
                    int m = nums[pA];
                    if(m == 0)
                        --countZ;
                    ++pA;
                }
            }

            ++pB;
            max = Math.max(max, pB - pA);
        }

        return max;
    }
}
