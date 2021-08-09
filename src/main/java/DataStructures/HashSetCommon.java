package DataStructures;

import java.util.HashSet;

public class HashSetCommon {
    public void hashSetOp(){
        HashSet hashSet = new HashSet();
        hashSet.add("ab");
        hashSet.add("cd");
        hashSet.add("ef");
        hashSet.add("gh");

        hashSet.add("ab");
        System.out.println("hashSet: " + hashSet);

        hashSet.remove("ab");
        System.out.println("hashSet after remove: " + hashSet);
    }
}
