package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsII {
    private void backtrack(List<List<Integer>> permutations, int[] nums, Set<Integer> chosen, Set<List<Integer>> uniqueCombinations, int index, List<Integer> currentPermutation) {
        if(nums.length == currentPermutation.size()) {
            List<Integer> upcomingPermutation = new ArrayList<>(currentPermutation);
            if(uniqueCombinations.contains(upcomingPermutation)) return;
            uniqueCombinations.add(upcomingPermutation);
            permutations.add(upcomingPermutation);
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(chosen.contains(i)) continue;
            int n = nums[i];
            chosen.add(i);
            currentPermutation.add(n);
            backtrack(permutations, nums, chosen, uniqueCombinations, index + 1, currentPermutation);
            chosen.remove(i);
            currentPermutation.remove(currentPermutation.size() - 1); // backtrack
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        Set<Integer> chosen = new HashSet<>();
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
        List<Integer> currentPermutation = new ArrayList<>();
        backtrack(permutations, nums, chosen, uniqueCombinations, 0, currentPermutation);
        return permutations;
    }
}
