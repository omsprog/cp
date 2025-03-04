package com.omsprog.algorithms.lc;

public class RemoveLinkedListElements {
    private void removeElementsRecursive(ListNode node, int val) {
        if(node.next == null) return;
        else removeElementsRecursive(node.next, val);
        if(node.next.val == val) node.next = node.next.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        removeElementsRecursive(head, val);
        if(head.val == val) head = head.next;
        return head;
    }
}
