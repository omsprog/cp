package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    private void generatePermutations(List<List<Integer>> permutations, Set<Integer> visited, List<Integer> curPermutation, int[] input) {
        if(curPermutation.size() == input.length) {
            permutations.add(new ArrayList<>(curPermutation));
            return;
        }
        for(int i = 0; i < input.length; i++) {
            int n = input[i];
            if(visited.contains(n)) continue;
            visited.add(n);
            curPermutation.add(n);
            generatePermutations(permutations, visited, curPermutation, input);
            visited.remove(n);
            curPermutation.remove(curPermutation.size() - 1); // backtrack
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();

        Set<Integer> visited = new HashSet<>();
        List<Integer> curPermutation = new ArrayList<>();

        generatePermutations(permutations, visited, curPermutation, nums);

        return permutations;
    }
}
