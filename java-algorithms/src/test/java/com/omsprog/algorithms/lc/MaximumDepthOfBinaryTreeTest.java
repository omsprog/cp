package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {
    @Test
    void testRecursiveDFS() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode n2 = new TreeNode(20);
        root.right = n2;
        n2.left = new TreeNode(15);
        n2.right = new TreeNode(7);

        MaximumDepthOfBinaryTreeRecursiveDFS rDFS = new MaximumDepthOfBinaryTreeRecursiveDFS();

        assertEquals(3, rDFS.maxDepth(root));
    }
}