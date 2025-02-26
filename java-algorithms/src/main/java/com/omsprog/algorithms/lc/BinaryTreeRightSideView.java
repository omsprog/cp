package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> nodes = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);
        while(!queue.isEmpty()) {
            int length = queue.size();
            int value = 0;

            for(int i = 0; i < length; i++) {
                TreeNode node = queue.poll();

                if(node.left != null)
                    queue.offer(node.left);

                if(node.right != null)
                    queue.offer(node.right);

                if(i == length - 1)
                    value = node.val;
            }
            nodes.add(value);
        }

        return nodes;
    }
}
