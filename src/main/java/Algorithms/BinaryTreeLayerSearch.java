package Algorithms;

import Entity.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
二叉树的层次遍历
 */

public class BinaryTreeLayerSearch {
    public static Queue<TreeNode> queue = new LinkedList<>();
    // 先序遍历
    public static void layerSearch(TreeNode root) {
        if (root != null) {
            System.out.printf("%-4s", root.data);
            if (root.left != null) {
                queue.offer(root.left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }
            TreeNode result = queue.poll();
            if (result != null) {
                layerSearch(result);
            }
        }
    }
}