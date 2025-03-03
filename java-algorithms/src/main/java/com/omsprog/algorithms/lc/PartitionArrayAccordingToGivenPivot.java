package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.List;

public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lP = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        List<Integer> rP = new ArrayList<>();

        for(int n : nums) {
            if(n < pivot) lP.add(n);
            else if(n > pivot) rP.add(n);
            else p.add(pivot);
        }

        int globalI = 0;

        // in place modification
        for(int n : lP) nums[globalI++] = n;
        for(int n : p) nums[globalI++] = n;
        for(int n : rP) nums[globalI++] = n;

        return nums;
    }
}
