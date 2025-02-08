package com.omsprog.algorithms.fundamentals.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void test() {
        LinkedList lL = new LinkedList(4);
        lL.append(5);
        lL.append(6);
        lL.append(6);
        lL.removeLast();
        lL.prepend(3);
        lL.prepend(2);
        lL.removeFirst();

        assertEquals(5, lL.get(2).value);
        assertEquals(null, lL.get(4));

        lL.append(100);
        lL.set(4, 7);
        assertEquals(7, lL.get(4).value);
        lL.insert(5, 9);
        lL.insert(5, 8);
        lL.printList();
    }
}