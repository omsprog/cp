package com.omsprog.algorithms.leetcode.medium.maximumsumofdistinctsubarrayswithlengthk;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubarraysWithLengthK {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> memory = new HashMap<>();
        int left = 0, right = 0;
        long maximumSum = 0;
        long globalSum = 0;
        while(right < nums.length) {
            int nR = nums[right];
            globalSum += nR;
            if(memory.containsKey(nR)) {
                int cur = memory.get(nR);
                memory.put(nR, cur + 1);
            } else
                memory.put(nR, 1);

            if(right - left + 1 == k) {
                if(memory.size() == k)
                    maximumSum = Math.max(globalSum, maximumSum);
                int nL = nums[left];
                globalSum -= nL;
                int cur = memory.get(nL);
                if(cur == 1)
                    memory.remove(nL);
                else
                    memory.put(nL, cur - 1);
                ++left;
            }
            ++right;
        }

        return maximumSum;
    }
}
