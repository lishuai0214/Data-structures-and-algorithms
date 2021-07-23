package Algorithms;

import java.util.LinkedList;
import java.util.List;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }else if (x == 0){
            return true;
        }

        List<Long> listInt = new LinkedList<>();
        long num = 1;
        while (num <= x){
            long s = (x/num)%10;
            listInt.add(s);
            num = num *10;
        }

        int listSize = listInt.size();
        System.out.println(listInt);

        for (int i=0; i<listSize/2; i++){
            if (listInt.get(i) != listInt.get(listSize - i -1)){
                return false;
            }
        }
        return true;
    }
}
