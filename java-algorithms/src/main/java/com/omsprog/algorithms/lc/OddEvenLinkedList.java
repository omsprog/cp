package com.omsprog.algorithms.lc;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        ListNode oddA = new ListNode(head.val);
        ListNode evenA = new ListNode(head.next.val);

        ListNode evenH = evenA;
        ListNode oddH = oddA;
        boolean isOdd = true;

        for(ListNode n = head.next.next; n != null;) {
            ListNode node = new ListNode(n.val);
            if(isOdd) {
                oddA.next = node;
                oddA = oddA.next;
            } else {
                evenA.next = node;
                evenA = evenA.next;
            }
            n = n.next;

            isOdd = !isOdd;
        }

        oddA.next = evenH;
        return oddH;
    }
}
