package com.omsprog.algorithms.leetcode.easy.intersectionoftwoarraysii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    private void setFrequenciesMap(Map<Integer, Integer> map, int[] nums) {
        for(int n : nums) {
            if(map.containsKey(n)) {
                int v = map.get(n);
                map.put(n, v + 1);
            } else
                map.put(n, 1);
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> mem1 = new HashMap<>();
        Map<Integer, Integer> mem2 = new HashMap<>();

        setFrequenciesMap(mem1, nums1);
        setFrequenciesMap(mem2, nums2);

        List<Integer> intersection = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mem1.entrySet()) {
            if(mem2.containsKey(entry.getKey())) {
                int oc = Math.min(entry.getValue(), mem2.get(entry.getKey()));
                for(int i = 0; i < oc; i++)
                    intersection.add(entry.getKey());
            }
        }

        int[] r = new int[intersection.size()];
        for(int i = 0; i < intersection.size(); i++)
            r[i] = intersection.get(i);
        return r;
    }
}
