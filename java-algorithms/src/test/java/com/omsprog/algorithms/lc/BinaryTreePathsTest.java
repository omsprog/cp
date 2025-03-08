package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathsTest {
    @Test
    void test() {
        BinaryTreePaths bTP = new BinaryTreePaths();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        TreeNode node1 = new TreeNode(2);
        node1.right = new TreeNode(5);
        root.left = node1;

        List<String> result = bTP.binaryTreePaths(root);
        assertEquals(2, result.size());
        assertEquals("1->2->5", result.get(0));
        assertEquals("1->3", result.get(1));
    }
}