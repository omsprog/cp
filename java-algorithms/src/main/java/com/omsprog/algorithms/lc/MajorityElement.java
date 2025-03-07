package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                int ocurrences = map.get(num);
                if(ocurrences + 1 > nums.length / 2) return num;
                else map.put(num, ocurrences + 1);
            } else
                map.put(num, 1);
        }

        return -1; // never executed
    }
}
