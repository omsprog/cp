package com.omsprog.algorithms.fundamentals.stack;

import com.omsprog.algorithms.fundamentals.Node;

public class Stack {
    private Node top;
    private int height;

    public Stack() {
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value) {
        Node newNode = new Node(value);

        newNode.next = top;
        top = newNode;

        height++;
    }

    public Node pop() {
        if(height == 0)
            return null;

        --height;

        Node tmp = top;
        top = top.next;
        tmp.next = null;
        return tmp;
    }

    public void printStack() {
        Node tmp = top;

        while(tmp != null) {
            System.out.println(tmp.value + " ");
            tmp = tmp.next;
        }
    }
}
