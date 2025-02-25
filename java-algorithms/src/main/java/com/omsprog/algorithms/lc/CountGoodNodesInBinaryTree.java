package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class CountGoodNodesInBinaryTree {
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;

        int count = 0;
        Deque<Object[]> stack = new ArrayDeque<>();
        stack.push(new Object[] {root, root.val});

        while(!stack.isEmpty()) {
            Object[] pair = stack.pop();
            TreeNode node = (TreeNode)pair[0];
            int maxValueSoFar = (int)pair[1];

            if(node.val >= maxValueSoFar)
                ++count;

            int newMax = Math.max(maxValueSoFar, node.val);
            if(node.right != null)
                stack.push(new Object[] {node.right, newMax});

            if(node.left != null)
                stack.push(new Object[] {node.left, newMax});
        }

        return count;
    }
}
