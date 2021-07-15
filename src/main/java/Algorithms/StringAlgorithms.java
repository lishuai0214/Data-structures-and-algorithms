package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class StringAlgorithms {

    /*
    给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

    示例 1:

    输入: s = "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    示例 2:

    输入: s = "bbbbb"
    输出: 1
    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    示例 3:

    输入: s = "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。

    示例 4:

    输入: s = ""
    输出: 0
     
    提示：
    0 <= s.length <= 5 * 104
    s 由英文字母、数字、符号和空格组成
    */
    public static int lengthOfLongestSubstring(String s) {
        System.out.println("s: " + s);
        Map<Character, Integer> strMap = new HashMap<>();
        int result = 0;
        char[] s_array = s.toCharArray();
        Integer start = 0;
        Integer end = 0;
        while (end < s_array.length){
            Integer mapGetCharNum = strMap.get(s_array[end]);
            if (mapGetCharNum == null){
                strMap.put(s_array[end], 1);
                end++;
            }else {
                strMap.remove(s_array[start]);
                start++;
            }

            if (result < end - start){
                result = end - start;
            }
            System.out.println(String.format("start: %s, end: %s", start, end));
            System.out.println("strMap:" + strMap);
        }
        return result;
    }
}
