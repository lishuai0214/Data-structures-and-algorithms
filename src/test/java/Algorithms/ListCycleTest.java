package Algorithms;

import Entity.ListNode;
import org.junit.Test;

public class ListCycleTest {
    @Test
    public void hasCycle(){
        ListNode head = null;
        ListNode temp = null;
        ListNode tep = head;
        ListNode cycle = null;
        for (int i=0; i<20; i++){
            if (head == null) {
                head = new ListNode(i);
                temp = head;
                tep = head;
            }else {
                temp.next = new ListNode(i);
                temp = temp.next;
                if (i == 9){
                    cycle = temp;
                }
            }
        }

        temp.next = cycle;

        for (int i=0; i<50; i++){
            System.out.print(tep.val);
            if (i != 49){
                System.out.print(" -> ");
            }
            tep = tep.next;
        }
        System.out.println("");

        ListCycle.hasCycle(head);
    }
}
