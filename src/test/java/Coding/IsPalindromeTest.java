package Coding;

import Algorithms.IsPalindrome;
import org.junit.Test;

public class IsPalindromeTest {

    @Test
    public void testIsPalindrome(){
        int x = 1410110141;
        boolean result = IsPalindrome.isPalindrome(x);
        System.out.println(result);
    }
}
