package com.omsprog.algorithms.lc;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null) return null;

        ListNode lN = new ListNode();
        ListNode head = lN;

        while(list1 != null || list2 != null) {
            if(list1 != null && list2 == null) {
                lN.val = list1.val;
                list1 = list1.next;
            }

            if(list1 == null && list2 != null) {
                lN.val = list2.val;
                list2 = list2.next;
            }

            if(list1 != null && list2 != null) {
                if(list1.val < list2.val) {
                    lN.val = list1.val;
                    list1 = list1.next;
                } else {
                    lN.val = list2.val;
                    list2 = list2.next;
                }
            }

            if(list1 != null || list2 != null) {
                ListNode lNAux = new ListNode();
                lN.next = lNAux;
                lN = lN.next;
            }
        }
        return head;
    }
}