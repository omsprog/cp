package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = null;
        List<TreeNode> list2 = null;

        Deque<TreeNode> stack = new ArrayDeque<>();
        Deque<List<TreeNode>> stackL = new ArrayDeque<>();

        stack.push(root);
        stackL.push(new ArrayList<>(List.of(root)));

        while(list1 == null || list2 == null) {
            TreeNode node = stack.pop();
            List<TreeNode> list = stackL.pop();

            if(node.val == p.val || node.val == q.val)
                if(list1 == null) list1 = list;
                else list2 = list;

            if(node.right != null) {
                stack.push(node.right);
                List<TreeNode> newList = new ArrayList<TreeNode>(list);
                newList.add(node.right);
                stackL.push(newList);
            }

            if(node.left != null) {
                stack.push(node.left);
                List<TreeNode> newList = new ArrayList<TreeNode>(list);
                newList.add(node.left);
                stackL.push(newList);
            }
        }

        TreeNode result = null;

        int len = list1.size() < list2.size() ? list1.size() : list2.size();

        for(int i = 0; i < len; i++)
            if(list1.get(i).val == list2.get(i).val) result = list1.get(i);
            else break;

        return result;
    }
}
