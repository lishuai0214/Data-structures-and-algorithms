package Algorithms;

import java.util.LinkedList;
import java.util.List;

public class IsPalindrome {
    /*
    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。

    示例 1：

    输入：x = 121
    输出：true
    示例 2：

    输入：x = -121
    输出：false
    解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
    示例 3：

    输入：x = 10
    输出：false
    解释：从右向左读, 为 01 。因此它不是一个回文数。
    示例 4：

    输入：x = -101
    输出：false
     
    提示：

    -231 <= x <= 231 - 1
     */

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
