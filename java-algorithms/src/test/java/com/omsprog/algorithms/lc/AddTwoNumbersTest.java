package com.omsprog.algorithms.lc;

import com.omsprog.algorithms.util.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    void test() {
        AddTwoNumbers aTN = new AddTwoNumbers();

        ListNode list1 = aTN.addTwoNumbers(
                    TestUtil.buildLinkedList(new int[] {2,4,3}),
                    TestUtil.buildLinkedList(new int[] {5,6,4})
        );
        assertTrue(TestUtil.isLinkedListValid(new int[] {7,0,8}, list1));

        ListNode list2 = aTN.addTwoNumbers(
                TestUtil.buildLinkedList(new int[] {9,9,9,9,9,9,9}),
                TestUtil.buildLinkedList(new int[] {9,9,9,9})
        );
        assertTrue(TestUtil.isLinkedListValid(new int[] {8,9,9,9,0,0,0,1}, list2));
    }
}