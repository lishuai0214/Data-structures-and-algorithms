package Algorithms;

import Entity.TreeNode;

/*
描述
操作给定的二叉树，将其变换为源二叉树的镜像。
比如：    源二叉树
            8
           /  \
          6   10
         / \  / \
        5  7 9 11
        镜像二叉树
            8
           /  \
          10   6
         / \  / \
        11 9 7  5
示例1
输入：
{8,6,10,5,7,9,11}
返回值：
{8,10,6,11,9,7,5}
 */


public class BinaryTreeMirror {
    public static TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null){
            return pRoot;
        }
        TreeNode left = Mirror(pRoot.left);
        TreeNode right = Mirror(pRoot.right);
        pRoot.left = right;
        pRoot.right = left;
        return pRoot;
    }
}
