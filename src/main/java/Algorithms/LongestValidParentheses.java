package Algorithms;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack stack = new Stack();
        int result = 0;
        int maxValue = 0;
        char[] scharArray = s.toCharArray();
        for (char c: scharArray){
            if (c == '('){
                stack.push(c);
            }else if (c == ')'){
                if (stack.empty()){

                }else {
                    char popchar = (char) stack.pop();
                    if (popchar == '(') {
                        maxValue = maxValue + 2;
                    } else {
                        result = Math.max(maxValue, result);
                        maxValue = 0;
                    }
                }
            }
        }
        return result;
    }
}
