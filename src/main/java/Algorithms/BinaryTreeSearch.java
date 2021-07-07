package Algorithms;

import Entity.TreeNode;

public class BinaryTreeSearch {
    // 先序遍历
    public void preSearch(TreeNode root) {
        if (root != null) {
            System.out.printf("%-4s", root.data);
            preSearch(root.left);
            preSearch(root.right);
        }
    }

    // 中序遍历
    public void midSearch(TreeNode root) {
        if (root != null) {
            midSearch(root.left);
            System.out.printf("%-4s", root.data);
            midSearch(root.right);
        }
    }

    // 后序遍历
    public void bacSearch(TreeNode root) {
        if (root != null) {
            bacSearch(root.left);
            bacSearch(root.right);
            System.out.printf("%-4s", root.data);
        }
    }
}