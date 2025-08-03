package com.omsprog;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetRecursiveTest {
    @Test
    void test() {
        PowerSetRecursive psr = new PowerSetRecursive();
        char[] characters = {'a', 'b', 'c'};
        Set<Set<Character>> powerSet = psr.calculatePowerSet(characters);

        for(Set<Character> set : powerSet) {
            System.out.print("[ ");
            for(char c : set) {
                System.out.print(c + " ");
            }
            System.out.println("]");
        }

        assertEquals(8, powerSet.size());
    }
}