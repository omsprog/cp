package com.omsprog.algorithms.lc;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Boolean> memory = new HashMap<>();
        List<Integer> disappearedNumbers = new ArrayList();

        // Initialize memory
        for(int i = 1; i <= nums.length; i++) {
            memory.put(i, false);
        }

        for(int num : nums)
            memory.put(num, true);

        for(Map.Entry<Integer, Boolean> entry : memory.entrySet())
            if(entry.getValue().equals(false))
                disappearedNumbers.add(entry.getKey());

        return disappearedNumbers;
    }
}
