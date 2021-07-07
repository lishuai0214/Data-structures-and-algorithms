package Coding;

import Algorithms.ReverseList;
import Entity.ListNode;
import Utils.ListOperation;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReverseListTest {

    static ListNode head = null;

    @BeforeClass
    public static void listInit(){
        head = new ListNode(0);
        ListNode temp = head;
        for (int i=1; i< 20; i++){
            ListNode listNode = new ListNode(i);
            temp.next = listNode;
            temp = temp.next;
        }
    }

    @Test
    public void testReverseList(){
        ListOperation.printList(head);
        ListNode newHead = ReverseList.ReverseList(head);
        ListOperation.printList(newHead);
        assertTrue( true );
    }
}
