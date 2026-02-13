package com.omsprog.algorithms.leetcode.easy.findtargetindicesaftersortingarray;

import java.util.ArrayList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        int occurrences = 0;
        int lessThanTargetCounter = 0;

        for(int n : nums) {
            if(n == target) ++occurrences;
            if(n < target) ++lessThanTargetCounter;
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < occurrences; i++) {
            result.add(i + lessThanTargetCounter);
        }

        return result;
    }
}
