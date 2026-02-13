package com.omsprog.algorithms.leetcode.easy.intersectionofmultiplearrays;

import java.util.*;

public class IntersectionOfMultipleArrays {
    public List<Integer> intersection(int[][] nums) {
        int numberOfArrays = nums.length;
        Map<Integer, Integer> frequencies = new HashMap<>();

        // calculate array of frequencies
        for(int[] arr : nums) {
            for(int ele : arr) {
                if(frequencies.containsKey(ele)) {
                    int v = frequencies.get(ele);
                    frequencies.put(ele, v + 1);
                } else
                    frequencies.put(ele, 1);
            }
        }

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if(entry.getValue() == numberOfArrays)
                result.add(entry.getKey());
        }

        Collections.sort(result);

        return result;
    }
}
