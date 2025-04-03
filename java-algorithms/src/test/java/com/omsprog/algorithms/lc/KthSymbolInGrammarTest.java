package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSymbolInGrammarTest {
    @Test
    void test() {
        KthSymbolInGrammar k = new KthSymbolInGrammar();
        assertEquals(1, k.kthGrammar(2,2));
        assertEquals(1, k.kthGrammar(3,3));
        assertEquals(0, k.kthGrammar(3,4));
        assertEquals(1, k.kthGrammar(4,8));
        assertEquals(0, k.kthGrammar(5,13));
    }
}