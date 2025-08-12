package com.omsprog.algorithms.lc;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        Map<String, Integer> memory = new HashMap<>();
        int index = 0;

        for(String str : strs) {
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sortedString = new String(characters);

            if(memory.containsKey(sortedString)) {
                int listIndex = memory.get(sortedString);
                List<String> existingAnagram = solution.get(listIndex);
                existingAnagram.add(str);
            } else {
                memory.put(sortedString, index);
                ++index;
                List<String> newAnagram = new ArrayList<>();
                newAnagram.add(str);
                solution.add(newAnagram);
            }
        }

        return solution;
    }
}
