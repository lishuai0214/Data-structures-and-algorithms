package Algorithms;

import Entity.ListNode;

public class ListCycle {

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
}
