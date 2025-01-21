package com.omsprog.algorithms.lc;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> memory = new HashMap<>();
        for(int num : nums) {
            if(memory.containsKey(num))
                return true;
            memory.put(num, true);
        }

        return false;
    }
}