package Coding;

import Entity.TreeNode;
import Utils.TreeOperation;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTest {
    static TreeNode root = null;

    @BeforeClass
    public static void binTreeInit(){
        TreeNode node11 = new TreeNode(10,null, null);
        TreeNode node10 = new TreeNode(10,null, node11);
        TreeNode node9 = new TreeNode(9,null,null);
        TreeNode node8 = new TreeNode(8, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node6 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(5, node10,null);
        TreeNode node4 = new TreeNode(4,node8,node9);
        TreeNode node3 = new TreeNode(3,node6,node7);
        TreeNode node2 = new TreeNode(2,node4,node5);
        TreeNode node1 = new TreeNode(1,node2,node3);
        root = node1;
    }

    @Test
    public void threeOrders (){
        TreeOperation.show(root);
        threeOrders(root);
    }

    public int[][] threeOrders (TreeNode root) {
        // write code here
        midOrder(root);
        return null;
    }

    private void preOrder(TreeNode root){
        if (root != null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void midOrder(TreeNode root){
        if (root != null) {
            midOrder(root.left);
            System.out.println(root.data);
            midOrder(root.right);
        }
    }

    private void rightOrder(TreeNode root){
        if (root != null) {
            rightOrder(root.left);
            rightOrder(root.right);
            System.out.println(root.data);
        }
    }
}
