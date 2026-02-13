package com.omsprog.algorithms.leetcode.easy.findcommoncharacters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonCharactersTest {
    @Test
    void test() {
        FindCommonCharacters findCommonCharacters = new FindCommonCharacters();
        assertEquals(List.of("e","l","l"), findCommonCharacters.commonChars(new String[] {"bella","label","roller"}));
        assertEquals(List.of("c","o"), findCommonCharacters.commonChars(new String[] {"cool","lock","cook"}));
    }
}