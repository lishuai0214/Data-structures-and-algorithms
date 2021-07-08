package Coding;

import Entity.TreeNode;
import Utils.TreeOperation;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTest {
    static TreeNode root = null;
    private static List<Integer> preList = new ArrayList<>();
    private static List<Integer> midList = new ArrayList<>();
    private static List<Integer> rightList = new ArrayList<>();
    int[][] result;

    private static int lenght = 0;
    private static int count = 0;

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
        treeCount(root);
        result = new int[3][lenght];

        count = 0;
        preOrder(root);
        count = 0;
        midOrder(root);
        count = 0;
        rightOrder(root);
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));
        return result;
    }

    private void treeCount(TreeNode root){
        if (root != null) {
            lenght++;
            treeCount(root.left);
            treeCount(root.right);
        }
    }

    private void preOrder(TreeNode root){
        if (root != null) {
            System.out.println(root.data);
            result[0][count++]=(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private void midOrder(TreeNode root){
        if (root != null) {
            midOrder(root.left);
            System.out.println(root.data);
            result[1][count++]=(root.data);
            midOrder(root.right);
        }
    }

    private void rightOrder(TreeNode root){
        if (root != null) {
            rightOrder(root.left);
            rightOrder(root.right);
            System.out.println(root.data);
            result[2][count++]=(root.data);
        }
    }

    @Test
    public void testtest(){
        int resulttest = firstBadVersion(99);
        System.out.println(resulttest);
    }

    public int firstBadVersion(int n) {
        int left=1,right=n;
        while (right > left){
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)){
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        return right;
    }

    public boolean isBadVersion(int i){
        if (i > 8){
            return true;
        }else {
            return false;
        }
    }
}
