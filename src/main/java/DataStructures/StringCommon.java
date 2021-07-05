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
}
