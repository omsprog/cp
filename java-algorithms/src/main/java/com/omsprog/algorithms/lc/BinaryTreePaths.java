package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<StringBuilder> stackSb = new ArrayDeque<>();

        List<String> results = new ArrayList<>();

        stack.push(root);
        stackSb.push((new StringBuilder()).append(root.val));

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            StringBuilder nodeSb = stackSb.pop();

            if(node.right != null) {
                stack.push(node.right);
                stackSb.push((new StringBuilder(nodeSb)).append("->").append(node.right.val));
            };

            if(node.left != null) {
                stack.push(node.left);
                stackSb.push((new StringBuilder(nodeSb)).append("->").append(node.left.val));
            }

            if(node.right == null && node.left == null) { // leaf node
                results.add(nodeSb.toString());
            }
        }

        return results;
    }
}
