package com.omsprog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsRecursive {

    private void calculatePermutationsRecursive(char[] characters, List<List<Character>> permutations, Set<Integer> visited, List<Character> currentPermutation) {
        if(currentPermutation.size() == characters.length) {
            permutations.add(new ArrayList<>(currentPermutation));
        } else {
            for(int i = 0; i < characters.length; i++) {
                if(visited.contains(i)) continue;

                char c = characters[i];
                currentPermutation.add(c);
                visited.add(i);
                calculatePermutationsRecursive(characters, permutations, visited, currentPermutation);
                currentPermutation.remove(currentPermutation.size() - 1);
                visited.remove(i);
            }
        }
    }

    public List<List<Character>> calculatePermutations(char[] characters) {
        List<List<Character>> permutations = new ArrayList<>();
        List<Character> currentPermutation = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        
        calculatePermutationsRecursive(characters, permutations, visited, currentPermutation);
        return permutations;
    }
}
