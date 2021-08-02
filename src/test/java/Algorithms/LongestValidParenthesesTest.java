package Algorithms;

import org.junit.Test;

public class LongestValidParenthesesTest {

    @Test
    public void testLongestValidParentheses(){
        LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
        String s = "(()";
        int result = longestValidParentheses.longestValidParentheses(s);
        System.out.println("result: " + result);
    }
}
