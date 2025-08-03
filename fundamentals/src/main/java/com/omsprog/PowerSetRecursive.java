package com.omsprog;

import java.util.HashSet;
import java.util.Set;

public class PowerSetRecursive {

    public Set<Set<Character>> calculatePowerSet(char[] characters) {
        Set<Set<Character>> powerSet = new HashSet<>();
        Set<Character> currentSet = new HashSet<>();
        calculatePowerSetRecursive(characters, 0, powerSet, currentSet);
        return powerSet;
    }
    
    private static void calculatePowerSetRecursive(char[] characters, int currentIndex, Set<Set<Character>> powerSet, Set<Character> currentSet) {
        if(currentIndex == characters.length) {
            powerSet.add(new HashSet<>(currentSet)); // creates a copy of the current set
        } else {
            char c = characters[currentIndex];
            currentSet.add(c);
            calculatePowerSetRecursive(characters, currentIndex + 1, powerSet, currentSet); // c is included in the subset
            currentSet.remove(c);
            calculatePowerSetRecursive(characters, currentIndex + 1, powerSet, currentSet); // c is not included in the subset
        }
    }
}