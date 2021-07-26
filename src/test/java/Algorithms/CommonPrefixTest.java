package Algorithms;

import org.junit.Test;

public class CommonPrefixTest {
    @Test
    public void testCommonPrefix0(){
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] strs = {"flower","flow","flight"};
        String result = commonPrefix.longestCommonPrefix(strs);
        System.out.println("result: " + result);
    }

    @Test
    public void testCommonPrefix1(){
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String result = commonPrefix.longestCommonPrefix(strs);
        System.out.println("result: " + result);
    }

    @Test
    public void testCommonPrefix2(){
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] strs = {"ab","a"};
        String result = commonPrefix.longestCommonPrefix(strs);
        System.out.println("result: " + result);
    }
}
