package Coding;

import Algorithms.CheckInclusion;
import Algorithms.ClimbStairs;
import Entity.ListNode;
import Entity.TreeNode;
import Utils.ListOperation;
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

    @Test
    public void climbStairs(){
        ClimbStairs climbStairs = new ClimbStairs();
        int result11 = climbStairs.climbStairs(30);
        System.out.println("result11: " + result11);
    }

    /*
    你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
    不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

    说明:
    为什么返回数值是整数，但输出的答案是数组呢?
    请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     */
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int fast = 1;
        int slow = 1;
        while (fast < length){
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    @Test
    public void removeDuplicates() {
        int[] nums = {0,0,1,1,1,2,2,3,3,40};
        int result000 = removeDuplicates(nums);
        System.out.println("result000: " + result000);
        System.out.println(Arrays.toString(nums));
    }

    List<List<Integer>> resultListInteger = new LinkedList<>();


    //未完成
    public List<List<Integer>> subsets(int[] nums) {

        for (int i=0; i<nums.length; i++){
            List<Integer> list = new LinkedList<>();
            for (int j=0; j<nums.length; j++){
                if (j != i){
                    list.add(nums[j]);
                }
            }
            resultListInteger.add(list);

            int[] intArray = new int[list.size()];
            for (int k=0; k<list.size(); k++){
                intArray[k] = list.get(k);
            }

            System.out.println("toString: " + Arrays.toString(intArray));
        }


        return resultListInteger;
    }

    @Test
    public void subsets(){
        int[] nums = {0,1,3,2};
        List<List<Integer>> result111 = subsets(nums);
        System.out.println(result111);
    }

    @Test
    public void findSubstring(){
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        findSubstring(s, words);
    }

    public List<Integer> findSubstring(String s, String[] words) {
        String compareStr = "";
        for (String word: words){
            compareStr = compareStr + word;
        }

        String compareStr1 = sortString(compareStr);

        for (int i=0; i<s.length()-compareStr1.length(); i++){
            String subString = s.substring(i, compareStr1.length());
            String subString1 = sortString(subString);
            if (subString1.equals(compareStr1)){
                for (int j=0; j<words.length; j++){

                }
            }
        }

        System.out.println(compareStr1);
        return null;
    }

    public String sortString(String compareStr){
        char[] compareStrArray = compareStr.toCharArray();
        Arrays.sort(compareStrArray);
        String compareStr1 = new String(compareStrArray);
        return compareStr1;
    }

    @Test
    public void strString(){
        String haystack = "";
        String needle = "";
        int result111 = strStr(haystack, needle);
        System.out.println("result111: " + result111);
    }

    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        for (int i=0; i<=haystackLength-needleLength; i++){
            String subString = haystack.substring(i, i+ needleLength);
            if (subString.equals(needle)){
                return i;
            }
        }

        return -1;
    }


    @Test
    public void letterCombinations(){
        String digits = "";
        List<String> listResult = letterCombinations(digits);
        System.out.println(listResult);
    }

    public List<String> letterCombinations(String digits){
        if (digits.length() == 0){
            return new LinkedList<>();
        }

        char[] digitsArray = digits.toCharArray();

        List<String> strList = new LinkedList<>();
        conbination(digitsArray, 0, "", strList);
        return strList;
    }

    public void conbination(char[] digitsArray, int i, String result, List<String> strList){

        if (i > digitsArray.length-1){
            strList.add(result);
            return;
        }

        char c = digitsArray[i];

        i = i + 1;

        if (c == '2'){
            char[] abc = {'a', 'b', 'c'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '3'){
            char[] abc = {'d', 'e', 'f'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '4'){
            char[] abc = {'g', 'h', 'i'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '5'){
            char[] abc = {'j', 'k', 'l'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '6'){
            char[] abc = {'m', 'n', 'o'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '7'){
            char[] abc = {'p', 'q', 'r', 's'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '8'){
            char[] abc = {'t', 'u', 'v'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }else if (c == '9'){
            char[] abc = {'w', 'x', 'y', 'z'};
            for (char cc: abc) {
                conbination(digitsArray, i, result + cc, strList);
            }
        }
    }

    public int firstMissingPositive(int[] nums) {
        int[] arrayArray = new int[Integer.MAX_VALUE];
        for (int num: nums){
            if (num > 0){
                arrayArray[num] = 1;
            }
        }

        for (int i=1; i<arrayArray.length; i++){
            if (arrayArray[i] == 0){
                return i;
            }
        }
        return 0;
    }

    @Test
    public void firstMissingPositive(){
        int[] nums = {7,8,9,11,12};
        int result222 = firstMissingPositive(nums);
        System.out.println("result222: " + result222);
    }

    @Test
    public void mergeTwoLists(){
        ListNode list00 = new ListNode(1);
        ListNode list01 = new ListNode(2);
        ListNode list02 = new ListNode(4);
        list00.next = list01;
        list01.next = list02;


        ListNode l20 = new ListNode(10);
        ListNode l21 = new ListNode(30);
        ListNode l22 = new ListNode(40);
        l20.next = l21;
        l21.next = l22;

        ListNode newHead = mergeTwoLists1(list00, l20);

        System.out.print("l10: ");
        ListOperation.printList(list00);
        System.out.print("l20: ");
        ListOperation.printList(l20);
        System.out.print("newHead: ");
        ListOperation.printList(newHead);
    }


    //未完成
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode newHead = l2;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while (l1 != null || temp2 !=null){
            if (l1.val < temp2.val){
                if (temp2 == l2){
                    ListNode tmp = temp1.next;
                    l1.next = temp2;
                    newHead = l1;
                }else {

                }
                temp1 = l1.next;
                temp1.next = temp2;
                newHead = l1;
            }
            l1 = l1.next;
        }

        return null;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<ListNode> listNodes1 = new LinkedList<>();
        List<ListNode> listNodes2 = new LinkedList<>();

        ListNode newHead = null;

        ListNode p1 = l1;
        while (p1 != null){
            listNodes1.add(p1);
            p1 = p1.next;
        }

        ListNode p2 = l2;
        while (p2 != null){
            listNodes2.add(p2);
            p2 = p2.next;
        }

        int i=0, j=0;

        ListNode tail = null;
        while (i<listNodes1.size() || j<listNodes2.size()){

            if (listNodes1.get(i).val > listNodes2.get(j).val){
                if (newHead == null){
                    newHead = listNodes2.get(i);
                    tail = newHead;
                }else {
                    tail.next = listNodes2.get(i);
                    tail = tail.next;
                }

                if (j<listNodes1.size()-1){
                    j++;
                }
            }else {
                if (newHead == null){
                    newHead = listNodes1.get(i);
                    tail = newHead;
                }else {
                    tail.next = listNodes1.get(i);
                    tail = tail.next;
                }
                if (i<listNodes2.size()-1){
                    i++;
                }
            }
        }

        return newHead;
    }
}
