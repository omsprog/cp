package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestZigZagPathInBinaryTree {
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;

        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<int[]> zStack = new ArrayDeque<>();

        stack.push(root);
        zStack.push(new int[]{0,0});

        int max = 0;

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int[] z = zStack.pop();
            int l = z[0];
            int r = z[1];

            max = Math.max(max, l);
            max = Math.max(max, r);

            if(node.right != null) {
                stack.push(node.right);
                zStack.push(new int[] {r + 1, 0});
            }

            if(node.left != null) {
                stack.push(node.left);
                zStack.push(new int[] {0, l + 1});
            }
        }

        return max;
    }
}
