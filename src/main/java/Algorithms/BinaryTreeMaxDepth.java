package Algorithms;

import Entity.TreeNode;

public class BinaryTreeMaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int leftDept = maxDepth(root.left);
            int rightDept = maxDepth(root.right);
            return Math.max(leftDept, rightDept) + 1;
        }
    }
}
