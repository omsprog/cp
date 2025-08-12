package com.omsprog.algorithms.util;

import com.omsprog.algorithms.lc.ListNode;

public class TestUtil {
    private static ListNode buildLLRecursive(int[] arr, int index) {
        if(index == arr.length) return null;
        ListNode node = new ListNode(arr[index]);
        node.next = buildLLRecursive(arr, index + 1);
        return node;
    }

    public static ListNode buildLinkedList(int[] arr) {
        return buildLLRecursive(arr, 0);
    }

    public static boolean isLinkedListValid(int[] expectedArray, ListNode pointer) {
        for(int element : expectedArray) {
            if(element != pointer.val) return false;
            pointer = pointer.next;
        }
        return true;
    }
}
