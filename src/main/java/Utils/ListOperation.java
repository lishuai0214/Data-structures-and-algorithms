package Utils;

import Entity.ListNode;

public class ListOperation {
    public static void printList(ListNode head){
        ListNode p = head;
        while (p != null){
            System.out.print(p.val);
            if (p.next != null){
                System.out.print(" -> ");
            }
            p = p.next;
        }
        System.out.println("");
    }
}
