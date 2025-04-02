package com.omsprog.algorithms.lc;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        boolean carry = false;

        while(!(l1 == null && l2 == null)) {
            int a = 0;
            int b = 0;
            int sum = 0;

            if(l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            sum = a + b;

            if(carry) {
                ++sum;
                carry = false;
            }

            if(sum > 9) {
                sum = sum - 10;
                carry = true;
            }

            ListNode newNode = new ListNode(sum);

            if(head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        if(carry)
            tail.next = new ListNode(1);

        return head;
    }
}
