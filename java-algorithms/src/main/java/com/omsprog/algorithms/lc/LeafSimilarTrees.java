package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeafSimilarTrees {
    private String calculateLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack = new ArrayDeque<>();

        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();

            // is leaf
            if(node.right == null && node.left == null) sb.append(node.val).append("-");

            if(node.right != null) stack.push(node.right);

            if(node.left != null) stack.push(node.left);
        }

        return sb.toString();
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return calculateLeaf(root1).equals(calculateLeaf(root2));
    }
}
