package com.omsprog.algorithms.fundamentals.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void test() {
        Stack st = new Stack(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        st.printStack();
    }
}