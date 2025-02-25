package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class PathSumIII {
    public int pathSumByNode(TreeNode root, int targetSum) {

        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<Long> sumStack = new ArrayDeque<>();
        int ocurrences = 0;
        sumStack.push(new Long(root.val));
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            long sum = sumStack.pop();
            if(sum == targetSum) ++ocurrences;

            if(node.right != null) {
                stack.push(node.right);
                long newSum = sum + node.right.val;
                sumStack.push(newSum);
            }

            if(node.left != null) {
                stack.push(node.left);
                long newSum = sum + node.left.val;
                sumStack.push(newSum);
            }
        }

        return ocurrences;
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        int res = 0;

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int lr = pathSumByNode(node, targetSum); // process node
            res += lr;
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }

        return res;
    }
}
