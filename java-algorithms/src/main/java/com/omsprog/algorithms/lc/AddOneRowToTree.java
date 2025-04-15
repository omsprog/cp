package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        int currentDepth = 1;

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(true) {
            int size = queue.size();

            if(currentDepth == depth - 1) {
                for(int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();

                    TreeNode newLeftNode = new TreeNode(val);
                    if(node.left != null) {
                        TreeNode left = node.left;
                        node.left = newLeftNode;
                        newLeftNode.left = left;
                    } else
                        node.left = newLeftNode;

                    TreeNode newRightNode = new TreeNode(val);
                    if(node.right != null) {
                        TreeNode right = node.right;
                        node.right = newRightNode;
                        newRightNode.right = right;
                    } else
                        node.right = newRightNode;
                }
                break;
            }

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            ++currentDepth;
        }

        return root;
    }
}
