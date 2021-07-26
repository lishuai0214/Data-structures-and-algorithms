package Algorithms;

public class CommonPrefix {
    /*
    14. 最长公共前缀
    编写一个函数来查找字符串数组中的最长公共前缀。

    如果不存在公共前缀，返回空字符串 ""。

    示例 1：
    输入：strs = ["flower","flow","flight"]
    输出："fl"
    示例 2：

    输入：strs = ["dog","racecar","car"]
    输出：""
    解释：输入不存在公共前缀。


    提示：
    0 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] 仅由小写英文字母组成
     */

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 0; i < 200; i++) {
            if (i > strs[0].length()-1){
                return result;
            }
            char c = strs[0].toCharArray()[i];
            for (String str: strs) {
                if (i > str.length()-1){
                    return result;
                }
                if (str.toCharArray()[i] != c){
                    return result;
                }
            }
            result = result + c;
        }

        return result;
    }
}
