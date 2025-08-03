package com.omsprog;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsRecursiveTest {
    @Test
    void test() {
        PermutationsRecursive pR = new PermutationsRecursive();
        char[] input = new char[] {'a', 'b', 'c', 'd'};
        List<List<Character>> permutations = pR.calculatePermutations(input);
        assertEquals(24, permutations.size());
        for(List<Character> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}