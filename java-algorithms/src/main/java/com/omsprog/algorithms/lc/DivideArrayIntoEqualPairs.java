package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(map.containsKey(num)) {
                int currentOc = map.get(num);
                map.put(num, currentOc + 1);
            } else
                map.put(num, 1);
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            if(entry.getValue() % 2 != 0) return false;

        return true;
    }
}
