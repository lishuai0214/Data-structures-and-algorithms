package DataStructures;

import java.util.Arrays;

public class StringCommon {

    //字符串反转
    public static String stringReverse(String str){
        return new StringBuffer(str).reverse().toString();
    }

    //字符串转数组
    public static String stringToCharArray(String str){
        char[] array_string = str.toCharArray();
        System.out.println("array before sort: " + Arrays.toString(array_string));

        //sort the array list
        Arrays.sort(array_string);
        System.out.println("array after sort: " +  Arrays.toString(array_string));

        //convert array to string
        String arrString = String.valueOf(array_string);
        System.out.println("convert array to string: " +  arrString);
        return  arrString;
    }

    /*
    格和单词的初始顺序。

    示例：

    输入："Let's take LeetCode contest"
    输出："s'teL ekat edoCteeL tsetnoc"

    提示：

    在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
     */

    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        String result = "";
        for (String str: strArr){
            result = result + " " + new StringBuffer(str).reverse().toString();
        }
        return result.substring(1);
    }
}
