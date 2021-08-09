package DataStructures;

import java.util.ArrayList;

public class ArrayListCommon {
    public void arrayListOp(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("arrayList: " + arrayList);
        System.out.println("arrayList size: " + arrayList.size());

        arrayList.remove(0);
        System.out.println("arrayList after remove index 0: " + arrayList);

        System.out.println("arrayList get 1: " + arrayList.get(1));
    }
}
