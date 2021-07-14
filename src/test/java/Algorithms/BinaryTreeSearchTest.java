package Algorithms;

import Entity.TreeNode;
import Utils.TreeOperation;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class BinaryTreeSearchTest {
    private static TreeNode root = null;

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
    public void testBinaryTreeSearch(){
        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch();
        System.out.println("show tree: ");
        TreeOperation.show(root);
        binaryTreeSearch.preSearch(root);
        assertTrue( true );
    }

    @Test
    public void testBinaryTreeLayerSearch(){
        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch();
        System.out.println("show tree: ");
        TreeOperation.show(root);
        BinaryTreeLayerSearch.layerSearch(root);
        assertTrue( true );
    }
}
