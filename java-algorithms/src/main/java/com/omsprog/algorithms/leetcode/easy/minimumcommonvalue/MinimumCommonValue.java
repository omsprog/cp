package com.omsprog.algorithms.leetcode.easy.minimumcommonvalue;

import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for(int n : nums1)
            nums1Set.add(n);
        for(int n : nums2)
            if(nums1Set.contains(n))
                return n;
        return -1;
    }
}
