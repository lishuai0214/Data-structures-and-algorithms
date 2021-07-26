package Algorithms;

import Entity.ListNode;
import org.junit.Test;

public class ListOperationTest {
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

        ListOperation.hasCycle(head);
    }

    @Test
    public void testFindFirstCommonNode(){
        ListNode head1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        head1.next = node2;
        ListNode node3 = new ListNode(2);
        node2.next = node3;
        ListNode node4 = new ListNode(3);
        node3.next = node4;
        ListNode node5 = new ListNode(4);
        node4.next = node5;
        ListNode node6 = new ListNode(5);
        node4.next = node6;


        ListNode head2 = new ListNode(0);
        ListNode node22 = new ListNode(11);
        head2.next = node22;
        ListNode node23 = new ListNode(22);
        node22.next = node23;
        ListNode node24 = new ListNode(33);
        node23.next = node24;
        ListNode node25 = new ListNode(44);
        node24.next = node25;
        ListNode node26 = new ListNode(45);
        node25.next = node26;

        ListNode head3 = new ListNode(0);
        ListNode node32 = new ListNode(11);
        head3.next = node32;
        ListNode node33 = new ListNode(22);
        node32.next = node33;
        ListNode node34 = new ListNode(33);
        node33.next = node34;
        ListNode node35 = new ListNode(44);
        node34.next = node35;
        ListNode node36 = new ListNode(45);
        node35.next = node36;

        node6.next = head3;
        node26.next = head3;

        ListOperation.printList(head1);
        ListOperation.printList(head2);
        ListOperation.printList(head3);


        ListOperation.FindFirstCommonNode(head1, head2);

    }

    @Test
    public void testFindFirstCommonNode1(){
        ListNode head1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        head1.next = node2;
//        ListNode node3 = new ListNode(2);
//        node2.next = node3;
//        ListNode node4 = new ListNode(3);
//        node3.next = node4;
//        ListNode node5 = new ListNode(4);
//        node4.next = node5;
//        ListNode node6 = new ListNode(5);
//        node5.next = node6;
//        ListNode node7 = new ListNode(6);
//        node6.next = node7;

        ListOperation.printList(head1);

        ListOperation.removeNthFromEnd(head1, 2);

        ListOperation.printList(head1);
    }

    @Test
    public void testSwapPairs(){
        ListNode head1 = new ListNode(0);
        ListNode node2 = new ListNode(1);
        head1.next = node2;
        ListNode node3 = new ListNode(2);
        node2.next = node3;
        ListNode node4 = new ListNode(3);
        node3.next = node4;
        ListNode node5 = new ListNode(4);
        node4.next = node5;
        ListNode node6 = new ListNode(5);
        node4.next = node6;

        ListOperation.printList(head1);
        ListOperation listOperation = new ListOperation();
        ListNode result = listOperation.swapPairs(head1);

        System.out.println("final result:");
        ListOperation.printList(result);
    }
}
