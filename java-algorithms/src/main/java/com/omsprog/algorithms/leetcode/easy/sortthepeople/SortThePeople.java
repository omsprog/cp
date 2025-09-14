package com.omsprog.algorithms.leetcode.easy.sortthepeople;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> memory = new HashMap<>();
        for(int i = 0; i < names.length; i++)
            memory.put(heights[i], names[i]);

        Arrays.sort(heights);

        for(int i = 0; i < names.length; i++)
            names[names.length - 1 - i] = memory.get(heights[i]);
        return names;
    }
}
