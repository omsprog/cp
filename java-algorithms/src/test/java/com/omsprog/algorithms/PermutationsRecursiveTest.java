package com.omsprog.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsRecursiveTest {
    @Test
    public void findPermutations() {
        List<Character> characters = new ArrayList<>(List.of('a', 'b', 'c'));
        PermutationsRecursive.findPermutations(characters);
        assertEquals(6, PermutationsRecursive.allPermutations.size());
        PermutationsRecursive.allPermutations.stream().forEach(ele -> System.out.println(ele));
    }
}