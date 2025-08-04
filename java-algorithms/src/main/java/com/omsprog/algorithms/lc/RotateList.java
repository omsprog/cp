package com.omsprog.algorithms.lc;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        int length = 0;
        ListNode pointer = head;
        ListNode lastNode = null;
        while(pointer != null) {
            lastNode = pointer;
            ++length;
            pointer = pointer.next;
        }

        if(length <= 1) return head;

        int positionsToRotate = k % length;

        if(positionsToRotate == 0) return head;

        pointer = head;

        int newEndPosition = length - positionsToRotate;
        int currentPosition = 0;

        while(pointer != null){
            ++currentPosition;
            if(currentPosition == newEndPosition) {
                ListNode newEnd = pointer;
                ListNode newHead = pointer.next;
                lastNode.next = head;
                newEnd.next = null;
                return newHead;
            }

            pointer = pointer.next;
        }

        return head;
    }
}
