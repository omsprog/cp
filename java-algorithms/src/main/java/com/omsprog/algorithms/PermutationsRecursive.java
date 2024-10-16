package com.omsprog.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationsRecursive {
    public static List<List<Character>> allPermutations = new ArrayList<>();

    private static void findPermutationsRecursive(List<Character> list, List<Character> permutation, Map<Character, Boolean> chosen) {
        if(permutation.size() == list.size()) {
            System.out.println(permutation);
            allPermutations.add(permutation);
        } else {
            for(int i = 0; i < list.size(); i++) {
                if(chosen.get(list.get(i)))
                    continue;
                permutation.add(list.get(i));
                chosen.put(list.get(i), true);
                findPermutationsRecursive(list, permutation, chosen);
                permutation.remove(list.get(i));
                chosen.put(list.get(i), false);
            }
        }
    }

    public static void findPermutations(List<Character> list) {
        List<Character> permutation = new ArrayList<>();
        Map<Character, Boolean> chosen = new HashMap<>();
        list.stream().forEach(character -> {
            chosen.put(character, false);
        });
        findPermutationsRecursive(list, permutation, chosen);
    }
}
