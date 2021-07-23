package Algorithms;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class MyAtoi {
    public int myAtoi(String s) {
        long result = 0;
        char[] sToCharArray = s.toCharArray();
        if (sToCharArray.length == 0) {
            return 0;
        }

        List<Character> numList = new LinkedList<>();
        boolean isNumber = false;
        int sign = 1;
        for (char c : sToCharArray) {
            if (isNumber == false) {
                if (c == '-' || c == '+' || (c >= '0' && c <= '9')) {
                    isNumber = true;
                    numList.add(c);
                } else if (c != ' ') {
                    return 0;
                }
            } else {
                if (c >= '0' && c <= '9') {
                    numList.add(c);
                } else {
                    break;
                }
            }
        }

        if (numList.size() == 0) {
            return 0;
        }

        System.out.println("numList1: " + numList);
        if (numList.get(0) == '-') {
            sign = -1;
            numList.remove(0);
        } else if (numList.get(0) == '+') {
            numList.remove(0);
        }

        while (numList.size() > 0 && numList.get(0) == '0'){
            numList.remove(0);
        }

        if (numList.size() == 0) {
            return 0;
        } else{
            if (numList.size() > 10) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
        }

        System.out.println("numList2: " + numList);

        long pwe = 1;
        for (int i=numList.size()-1; i>=0; i--){
            result = result + (numList.get(i) - 48) * pwe;
            System.out.println(String.format(" result: %s, pwe: %s, numList.get(%s): %s", result, pwe, i ,numList.get(i)));
            pwe = pwe * 10;
        }

        result = result * sign;

        System.out.println("sign result: " + result);

        if (result > Integer.MAX_VALUE){
            result = Integer.MAX_VALUE;
        }else if (result < Integer.MIN_VALUE){
            result = Integer.MIN_VALUE;
        }

        int result1 = (int)result;

        return result1;
    }

    @Test
    public void myAtoi() {
        String str = "00000-42a1234";
        System.out.println("str:" + str);
        int result = myAtoi(str);
        System.out.println("final result: " + result);
    }
}
