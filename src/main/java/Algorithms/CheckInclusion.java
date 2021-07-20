package Algorithms;

import java.util.Arrays;

public class CheckInclusion {
    /*
    567. 字符串的排列
    给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的排列。

    换句话说，第一个字符串的排列之一是第二个字符串的 子串 。

    示例 1：

    输入: s1 = "ab" s2 = "eidbaooo"
    输出: True
    解释: s2 包含 s1 的排列之一 ("ba").
    示例 2：

    输入: s1= "ab" s2 = "eidboaoo"
    输出: False

    提示：
    1 <= s1.length, s2.length <= 104
    s1 和 s2 仅包含小写字母
     */

    public static boolean checkInclusion(String s1, String s2) {
        int lenght1= s1.length();
        int lenght2 = s2.length();
        if (lenght1 > lenght2){
            return false;
        }

        char[] str1ToCharArray = s1.toCharArray();
        Arrays.sort(str1ToCharArray);
        String sortedStr1 = new String(str1ToCharArray);

        for (int i = 0; i < lenght2 - lenght1 + 1; i++){
            String temp = s2.substring(i, i + lenght1);
            char[] stringToCharArray = temp.toCharArray();
            Arrays.sort(stringToCharArray);
            String sortedTemp = new String(stringToCharArray);
            System.out.println("sortedStr1: " + sortedStr1);
            System.out.println("sortedTemp: " + sortedTemp);
            if (sortedStr1.equals(sortedTemp)){
                return true;
            }
        }
        return false;
    }
}
