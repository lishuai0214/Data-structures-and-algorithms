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

    /*
    876. 链表的中间结点
    给定一个头结点为 head 的非空单链表，返回链表的中间结点。

    如果有两个中间结点，则返回第二个中间结点。

    示例 1：

    输入：[1,2,3,4,5]
    输出：此列表中的结点 3 (序列化形式：[3,4,5])
    返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
    注意，我们返回了一个 ListNode 类型的对象 ans，这样：
    ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
    示例 2：

    输入：[1,2,3,4,5,6]
    输出：此列表中的结点 4 (序列化形式：[4,5,6])
    由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。


    提示：

    给定链表的结点数介于 1 和 100 之间。
     */

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /*
    给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
    进阶：你能尝试使用一趟扫描实现吗？

    示例 1：
    输入：head = [1,2,3,4,5], n = 2
    输出：[1,2,3,5]
    示例 2：

    输入：head = [1], n = 1
    输出：[]
    示例 3：

    输入：head = [1,2], n = 1
    输出：[1]
     
    提示：
    链表中结点的数目为 sz
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz
     */

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;

        //节点为1个的情况
        if (head.next == null && n == 1){
            head = null;
            return head;
        }

        for (int i=0; i<n; i++){
            right = right.next;
        }

        //倒数第n个是head
        if (right == null){
            head = head.next;
            return head;
        }

        while (right.next != null){
            right = right.next;
            left = left.next;
        }

        System.out.println(String.format("left value: %s", left.val));
        System.out.println(String.format("right value: %s", right.val));

        left.next = left.next.next;

        return head;
    }
}
