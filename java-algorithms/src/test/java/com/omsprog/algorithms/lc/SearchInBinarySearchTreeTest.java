package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInBinarySearchTreeTest {
    @Test
    void test() {
        SearchInBinarySearchTree sIB = new SearchInBinarySearchTree();

        TreeNode root = new TreeNode(4);
        TreeNode n1 = new TreeNode(2);
        n1.left = new TreeNode(1);
        n1.right = new TreeNode(3);
        root.left = n1;
        root.right = new TreeNode(7);

        TreeNode nR = sIB.searchBST(root, 2);
        assertEquals(2, nR.val);
        assertEquals(1, nR.left.val);
        assertEquals(3, nR.right.val);
    }
}