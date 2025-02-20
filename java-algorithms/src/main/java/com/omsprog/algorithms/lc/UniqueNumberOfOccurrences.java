package com.omsprog.algorithms.lc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele : arr) {
            if(map.containsKey(ele)) {
                int ocurrence = map.get(ele);
                map.put(ele, ++ocurrence);
            } else
                map.put(ele, 1);
        }

        boolean result = true;
        Set<Integer> ocurrences = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(ocurrences.contains(entry.getValue()))
                return false;
            else
                ocurrences.add(entry.getValue());
        }

        return result;
    }
}
