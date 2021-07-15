package Algorithms;

import org.junit.Test;

public class PalindromeStringTest {
    @Test
    public void testLongestPalindrome(){
        String testStr = "bb";
        String result = PalindromeString.longestPalindrome(testStr);
        System.out.println("result: " + result);
    }
}
