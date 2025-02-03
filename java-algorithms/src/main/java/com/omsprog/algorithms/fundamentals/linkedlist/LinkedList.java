package com.omsprog.algorithms.fundamentals.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        ++length;
    }

    public void printList() {
        Node tmp = head;

        while(tmp != null) {
            System.out.println(tmp.value + " ");
            tmp = tmp.next;
        }
    }

    public Node removeLast() {
        if(length == 0) return null;

        Node temp = head;
        Node pre = head;

        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        ++length;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node tmp = head;

        if(length == 1)
            tail = head = null;
        else {
            head = head.next;
        }

        tmp.next = null;
        --length;

        return tmp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length)
            return null;

        Node target = head;
        int currentIndex = 0;

        while(currentIndex != index) {
            target = target.next;
            ++currentIndex;
        }

        return target;
    }

    public boolean set(int index, int value) {
        Node node = get(index);

        if(node == null)
            return false;

//        temp.value = value;
        return true;
    }
//    public boolean insert(int index, int value);
}
