package com.omsprog.algorithms.leetcode.medium.majorityelementii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int length = nums.length / 3;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> memory = new HashMap<>();

        for(int n : nums) {
            if(memory.containsKey(n)) {
                int curVal = memory.get(n);
                memory.put(n, curVal + 1);
            } else
                memory.put(n, 1);
        }

        for(Map.Entry<Integer, Integer> entry : memory.entrySet())
            if(entry.getValue() > length)
                result.add(entry.getKey());
        return result;
    }
}
