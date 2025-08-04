package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode pointer = head;
        List<Integer> numbers = new ArrayList<>();

        while(pointer != null) {
            numbers.add(pointer.val);
            pointer = pointer.next;
        }

        Collections.sort(numbers);

        ListNode node = null;
        for(int i = numbers.size() - 1; i >= 0; i--) {
            node = new ListNode(numbers.get(i), node);
        }

        return node;
    }
}
