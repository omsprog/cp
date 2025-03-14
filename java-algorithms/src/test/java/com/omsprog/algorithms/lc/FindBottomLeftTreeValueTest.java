package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindBottomLeftTreeValueTest {
    @Test
    void test() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        root2.right = new TreeNode(7);
        root2.right.right = new TreeNode(10);

        FindBottomLeftTreeValue fB = new FindBottomLeftTreeValue();

        assertEquals(1, fB.findBottomLeftValue(root1));
        assertEquals(4, fB.findBottomLeftValue(root2));

    }
}