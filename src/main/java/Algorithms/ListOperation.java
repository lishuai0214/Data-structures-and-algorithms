package Algorithms;

import Entity.ListNode;

public class ListOperation {

    //Checks if there are rings in the linked list and prints out the location of the rings
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean isCycle = false;

        if (head == null || head.next == null || head.next.next == null){
            isCycle = false;
        }else {
            try {
                while (fast.next.next != null && slow.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
                    if (fast == slow) {
                        isCycle = true;
                        break;
                    }
                }
            } catch (Exception e) {
                isCycle = false;
            }

            if (isCycle) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                System.out.println("cycle point is: " + slow.val);
            }
        }

        return isCycle;
    }

//    输入两个无环的单链表，找出它们的第一个公共结点。（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        Integer pHead1_c = getListLenght(pHead1);
        Integer pHead2_c = getListLenght(pHead2);
        if (pHead1_c > pHead2_c){
            for (int c=0; c< pHead1_c - pHead2_c; c++){
                pHead1 = pHead1.next;
            }
        }else if (pHead1_c < pHead2_c){
            for (int c=0; c< pHead2_c - pHead1_c; c++){
                pHead2 = pHead2.next;
            }
        }

        while (pHead1 != pHead2 && pHead1 != null && pHead2 != null){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }

        if (pHead1_c == null && pHead2_c == null){
            return null;
        }

        return pHead1;
    }

    public static Integer getListLenght(ListNode head){
        Integer count = 0;
        ListNode p = head;
        while (p != null){
            count++;
            p = p.next;
        }
        return count;
    }

    public static void printList(ListNode head){
        ListNode p = head;
        while (p != null){
            System.out.print(p.val);
            if (p.next != null) {
                System.out.print(" -> ");
            }
            p = p.next;
        }
        System.out.println("");
    }
}
