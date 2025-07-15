package com.omsprog.algorithms.lc;

import java.util.*;

public class ThreeSum {
    // target = b + c  =>  b = target - c
    private List<List<Integer>> twoSum(int target, int[] nums, int startIndex) {
        Set<Integer> memory = new HashSet<>();
        List<List<Integer>> pairs = new ArrayList<>();

        for(int i = startIndex; i < nums.length; i++) {
            int current = nums[i];
            int complement = target - current;

            if(memory.contains(complement)) {
                pairs.add(Arrays.asList(current, complement));
                // Skipping consecutive duplicates
                while(i + 1 < nums.length && nums[i] == nums[i + 1])
                    i++;
            }
            memory.add(current);
        }

        return pairs;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            // Skipping consecutive duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int current = nums[i];
            List<List<Integer>> twoSumPairs = twoSum(-current, nums, i + 1);

            for(List<Integer> pair : twoSumPairs) {
                List<Integer> triplet = Arrays.asList(current, pair.get(0), pair.get(1));
                result.add(triplet);
            }
        }

        return result;
    }
}
