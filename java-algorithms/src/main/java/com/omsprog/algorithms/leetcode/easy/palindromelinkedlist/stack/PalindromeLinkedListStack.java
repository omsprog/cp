package com.omsprog.algorithms.leetcode.easy.palindromelinkedlist.stack;

import com.omsprog.algorithms.lc.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeLinkedListStack {
    public boolean isPalindrome(ListNode head) {
        int items = 0;

        ListNode pointer = head;

        while(pointer != null) {
            ++items;
            pointer = pointer.next;
        }

        boolean isEven = items % 2 == 0;

        Deque<Integer> stack = new ArrayDeque<>();

        pointer = head;
        for(int i = 0; i < items / 2; i++) {
            stack.push(pointer.val);
            pointer = pointer.next;
        }

        if(!isEven) pointer = pointer.next;

        while(pointer != null) {
            if(stack.pop() != pointer.val)
                return false;
            pointer = pointer.next;
        }

        return stack.isEmpty();
    }
}
