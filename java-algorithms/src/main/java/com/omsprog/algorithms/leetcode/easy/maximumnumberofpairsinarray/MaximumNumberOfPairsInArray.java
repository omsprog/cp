package com.omsprog.algorithms.leetcode.easy.maximumnumberofpairsinarray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumNumberOfPairsInArray {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> memory = new HashMap<>();
        Set<Integer> indexes = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(memory.containsKey(nums[i])) {
                indexes.add(memory.get(nums[i]));
                indexes.add(i);
                memory.remove(nums[i]);
            } else
                memory.put(nums[i], i);
        }

        return new int[] {indexes.size() / 2, nums.length - indexes.size()};
    }
}
