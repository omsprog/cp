package com.omsprog.algorithms.leetcode.easy.intersectionoftwoarrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> memory = new HashSet<>();
        for(int n : nums1)
            memory.add(n);

        List<Integer> intersection = new ArrayList<>();
        for(int n : nums2) {
            if(memory.contains(n)) {
                intersection.add(n);
                memory.remove(n);
            }
        }

        // returning result
        int[] result = new int[intersection.size()];
        for(int index = 0; index < intersection.size(); index++) {
            result[index] = intersection.get(index);
        }

        return result;
    }
}
