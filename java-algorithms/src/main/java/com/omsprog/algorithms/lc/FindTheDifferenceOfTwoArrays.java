package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> elementsIn1 = new HashSet<>();
        Set<Integer> elementsIn2 = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();

        for(int num : nums1)
            elementsIn1.add(num);

        for(int num : nums2)
            elementsIn2.add(num);

        Set<Integer> elementsIn1Tmp = new HashSet<>(elementsIn1);

        elementsIn1.removeAll(elementsIn2);
        elementsIn2.removeAll(elementsIn1Tmp);

        result.add(new ArrayList<>(elementsIn1));
        result.add(new ArrayList<>(elementsIn2));

        return result;
    }
}
