package com.omsprog.algorithms.leetcode.medium.mergeinbetweenlinkedlists;

import com.omsprog.algorithms.lc.ListNode;

public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode headInList2 = list2;
        ListNode tailInList2 = null;

        ListNode pointer = list2;
        while(pointer != null) {
            tailInList2 = pointer;
            pointer = pointer.next;
        }

        pointer = list1;
        int index = 0;
        ListNode cutPoint1 = null;
        ListNode cutPoint2 = null;
        while(cutPoint1 == null || cutPoint2 == null) {
            if(index == a - 1)
                cutPoint1 = pointer;
            if(index == b)
                cutPoint2 = pointer;
            ++index;
            pointer = pointer.next;
        }

        cutPoint1.next = headInList2;
        tailInList2.next = cutPoint2.next;
        return list1;
    }
}
