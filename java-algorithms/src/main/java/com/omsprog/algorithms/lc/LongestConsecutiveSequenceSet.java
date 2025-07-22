package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceSet {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mem = new HashSet<>();
        int longest = 0;

        for(int n : nums)
            mem.add(n);

        for(int entry : mem) {
            if(!mem.contains(entry - 1)) { // element is the start of a sequence
                int currentVal = entry;
                int localCounter = 0;

                while(mem.contains(currentVal)) {
                    ++localCounter;
                    ++currentVal;
                }

                if(localCounter > longest)
                    longest = localCounter;
            }
        }

        return longest;
    }
}
