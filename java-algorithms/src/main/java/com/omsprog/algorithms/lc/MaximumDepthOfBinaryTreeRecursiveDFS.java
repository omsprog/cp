package com.omsprog.algorithms.lc;

public class MaximumDepthOfBinaryTreeRecursiveDFS {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
