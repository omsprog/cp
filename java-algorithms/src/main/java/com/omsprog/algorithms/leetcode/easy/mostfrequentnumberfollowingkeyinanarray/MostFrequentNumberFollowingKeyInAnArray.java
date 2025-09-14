package com.omsprog.algorithms.leetcode.easy.mostfrequentnumberfollowingkeyinanarray;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKeyInAnArray {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> memory = new HashMap<>();
        int mostFrequent = -1;
        int maxFrequency = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != key) continue;

            int n = nums[i + 1];

            if(memory.containsKey(n)) {
                int cur = memory.get(n);
                memory.put(n, cur + 1);
                if(cur + 1 > maxFrequency) {
                    mostFrequent = n;
                    maxFrequency = cur + 1;
                }
            } else {
                memory.put(n, 1);
                if(1 > maxFrequency) {
                    mostFrequent = n;
                    maxFrequency = 1;
                }
            }
        }

        return mostFrequent;
    }
}
