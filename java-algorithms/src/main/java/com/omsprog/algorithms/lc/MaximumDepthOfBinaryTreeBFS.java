package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTreeBFS {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Deque<TreeNode> queue = new ArrayDeque<>();

        int depth = 0;

        queue.offer(root);

        while(!queue.isEmpty()) {
            int length = queue.size();
            for(int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            ++depth;
        }

        return depth;
    }
}
