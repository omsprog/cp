package com.omsprog.algorithms.lc;

import java.util.*;

public class HowManyNumbersAreSmallesThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Map<Integer, Integer> memory = new HashMap<>();
        Arrays.sort(sortedArray);

        for(int i = 0; i < sortedArray.length; i++) {
            if(memory.containsKey(sortedArray[i]))
                continue;

            memory.put(sortedArray[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = memory.get(nums[i]);
        }

        return nums;
    }
}
