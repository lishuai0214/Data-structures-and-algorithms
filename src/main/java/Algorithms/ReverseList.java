package Algorithms;

import Entity.ListNode;

public class ReverseList {
    public static ListNode ReverseList(ListNode head) {
        if (head == null){
            return null;
        }

        ListNode left = head;
        if (left.next == null){
            return left;
        }

        ListNode middle = left.next;
        ListNode right = null;
        if (middle.next != null){
            right = middle.next;
        }

        left.next = null;
        while (right != null){
            middle.next = left;
            left = middle;
            middle = right;
            right = right.next;
        }

        middle.next = left;
        return middle;
    }
}
