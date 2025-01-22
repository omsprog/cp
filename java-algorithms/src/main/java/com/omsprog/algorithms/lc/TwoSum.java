package com.omsprog.algorithms.lc;

import java.util.*;
// a + b = target   ->   target - b = a
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memory = new HashMap<>();

        for(int index = 0; index < nums.length; index++) {
            if(memory.containsKey(target - nums[index])) {
                return new int[] { memory.get(target - nums[index]), index };
            } else {
                memory.put(nums[index], index);
            }
        }

        return new int[] {};
    }
}
