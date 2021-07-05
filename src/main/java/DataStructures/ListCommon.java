package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListCommon {

    public static void main( String[] args )
    {
        ListCommon.listInit();
    }

    //list的初始化方法
    public static void listInit(){
        List<Integer> intList1 = new ArrayList<>();
        intList1.add(1);
        intList1.add(3);
        intList1.add(2);
        intList1.add(8);
        intList1.add(10);
        intList1.add(4);
        intList1.add(0);
        System.out.print("intList1 before sorted: ");
        System.out.println(intList1);

        //list排序
        Collections.sort(intList1);

        System.out.print("intList1 sorted: ");
        System.out.println(intList1);

        Collections.reverse(intList1);

        System.out.print("intList1 reverse: ");
        System.out.println(intList1);



        List<Integer> intList2 = new LinkedList<>();
        intList2.add(0);
        intList2.add(1);
        intList2.add(2);
        intList2.add(20);
        intList2.add(11);
        intList2.add(15);
        intList2.add(9);
        System.out.print("intList2 before sorted: ");
        System.out.println(intList2);

        Collections.sort(intList2);

        System.out.print("intList2 sorted: ");
        System.out.println(intList2);

    }

}
