package org.learning.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        List<Integer> stack_val = new ArrayList<Integer>();
        TreeNode item = root;
        checkNode(stack,root);
        for (int i = 0; i < stack.size(); i++)
            stack_val.add(stack.get(i).val);

        return stack_val;
    }

    public void checkNode(List<TreeNode> stack , TreeNode node){
        if (null == node)return;
        if (null != node.left)
            checkNode(stack,node.left);
        stack.add(node);
        if (null != node.right)
            checkNode(stack,node.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.inorderTraversal(root);
    }
}
