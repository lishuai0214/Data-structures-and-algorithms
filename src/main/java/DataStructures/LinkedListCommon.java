package DataStructures;

import java.util.LinkedList;

public class LinkedListCommon {
    public void linkListOp(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        System.out.println("linkedList: " + linkedList);
        System.out.println("linkedList size: " + linkedList.size());

        linkedList.remove(2);
        System.out.println("linkedList after remove: " + linkedList);
    }
}
