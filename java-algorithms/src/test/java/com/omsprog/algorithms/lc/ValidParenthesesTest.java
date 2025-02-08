package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    void test() {
        ValidParentheses vP = new ValidParentheses();
        assertEquals(true, vP.isValid("()"));
        assertEquals(true, vP.isValid("()[]{}"));
        assertEquals(false, vP.isValid("(]"));
        assertEquals(true, vP.isValid("([])"));
    }
}