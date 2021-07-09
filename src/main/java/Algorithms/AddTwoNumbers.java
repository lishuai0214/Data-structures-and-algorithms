package Algorithms;

import Entity.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
请你将两个数相加，并以相同形式返回一个表示和的链表。
你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
*/

//https://leetcode-cn.com/problems/add-two-numbers/

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer flag = 0;
        Integer value;
        ListNode p1=l1, p2=l2;
        ListNode result = null;
        ListNode p3 = null;

        while (p1 != null || p2 != null || flag !=0){
            System.out.println("flag: " + flag);

            Integer p1_val = (p1 == null) ? 0 : p1.val;
            Integer p2_val = (p2 == null) ? 0 : p2.val;
            Integer sum = p1_val + p2_val + flag;

            value = sum%10;
            flag = sum/10;

            if (p3 == null){
                p3 = new ListNode(value);
                result = p3;
            }else {
                p3.next = new ListNode(value);
                p3 = p3.next;
            }

            if (p1 != null){
                p1 = p1.next;
            }

            if (p2 != null){
                p2 = p2.next;
            }
        }
        return result;
    }
}
