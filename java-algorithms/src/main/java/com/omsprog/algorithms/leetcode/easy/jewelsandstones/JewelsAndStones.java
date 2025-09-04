package com.omsprog.algorithms.leetcode.easy.jewelsandstones;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> memory = new HashSet<>();
        for(char c : jewels.toCharArray())
            memory.add(c);

        int numOfJewels = 0;

        for(char c : stones.toCharArray())
            if(memory.contains(c)) ++numOfJewels;

        return numOfJewels;
    }
}
