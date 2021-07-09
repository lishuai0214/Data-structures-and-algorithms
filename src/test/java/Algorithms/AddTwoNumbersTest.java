package Algorithms;

import Entity.ListNode;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers(){
        ListNode list1_head = new ListNode(9);
        ListNode list1_1 = new ListNode(9);
        list1_head.next = list1_1;
        ListNode list1_2 = new ListNode(9);
        list1_1.next = list1_2;

        ListNode list2_head = new ListNode(9);
        ListNode list2_1 = new ListNode(9);
        list2_head.next = list2_1;
        ListNode list2_2 = new ListNode(9);
        list2_1.next = list2_2;
        ListNode list2_3 = new ListNode(9);
        list2_2.next = list2_3;
        ListNode list2_4 = new ListNode(9);
        list2_3.next = list2_4;




        System.out.print("list1: ");
        ListOperation.printList(list1_head);
        System.out.print("list2: ");

        ListOperation.printList(list2_head);
        ListNode result = AddTwoNumbers.addTwoNumbers(list1_head, list2_head);
        ListOperation.printList(result);

    }
}
