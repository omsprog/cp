package com.omsprog.algorithms.leetcode.easy.containsduplicateii;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> memory = new HashSet<>();
        int left = 0;
        int right = 0;

        while(right < nums.length) {
            if(memory.contains(nums[right])) return true;
            memory.add(nums[right]);
            if(right - left + 1 == k + 1) {
                memory.remove(nums[left]);
                ++left;
            }
            ++right;
        }

        return false;
    }
}
