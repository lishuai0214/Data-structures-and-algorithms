package Coding;

import Algorithms.CheckInclusion;
import Entity.TreeNode;
import Utils.TreeOperation;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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

    /*
    7. 整数反转
    给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

    如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

    假设环境不允许存储 64 位整数（有符号或无符号）。


    示例 1：

    输入：x = 123
    输出：321
    示例 2：

    输入：x = -123
    输出：-321
    示例 3：

    输入：x = 120
    输出：21
    示例 4：

    输入：x = 0
    输出：0


    提示：

    -231 <= x <= 231 - 1
     */


    public int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }

        int a = Math.abs(x);
        int sign = 1;
        if (x < 0){
            sign = -1;
        }else if (x == 0){
            sign = 0;
        }

        int ressut = 0;
        List<Integer> intnum = new LinkedList<>();
        List<Integer> int10 = new LinkedList<>();
        for (int i=1; i<=a && i<=1000000000; i=i*10){
            System.out.println("i: " + i);
            int a_3 = (a/i)%10;
            System.out.println(String.format("a_3: %s", a_3));
            int10.add(i);
            intnum.add(a_3);
        }

        System.out.println("intnum: " + intnum);
        System.out.println("int10: " + int10);

        for (int j=0; j<intnum.size(); j++){
            System.out.println(String.format("int10.get(j): %s, intnum.get(intnum.size() - j - 1): %s", int10.get(j), intnum.get(intnum.size() - j - 1)));
            if (intnum.get(intnum.size() - j - 1) > 2 && int10.get(j) >= 1000000000){
                return 0;
            }else if (intnum.get(intnum.size() - j - 1) == 2){
                 if (sign == 1 && ressut > 147483647){
                     return 0;
                 }else if (sign == -1 && ressut > 147483648){
                     return 0;
                 }
            }
            ressut = ressut + int10.get(j) * intnum.get(intnum.size() - j - 1);
            System.out.println("ressut: " + ressut);
        }

        ressut = ressut * sign;

        System.out.println("result: " + ressut);
        return ressut;
    }

    @Test
    public void testInt(){
        int aa = 1534236469;
        int result00 = reverse(aa);
        System.out.println("result00: " + result00);
    }

}
