package Coding;

import org.junit.Test;

import java.util.Stack;

public class IsValidTest {

    @Test
    public void testValid(){
        String s = "()";
        boolean result = validTest(s);
        System.out.println(result);
    }

    public boolean validTest(String s){
        Stack<Character> stack = new Stack();
        char[] s_char_array = s.toCharArray();
        for (char c: s_char_array){

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else if (stack.empty()){
                return false;
            }else if (c == ')'){
                char pop = stack.pop();
                if (pop != '('){
                    return false;
                }
            }else if (c == '}'){
                char pop = stack.pop();
                if (pop != '{'){
                    return false;
                }
            }else if (c == ']'){
                char pop = stack.pop();
                if (pop != '['){
                    return false;
                }
            }
        }

        return stack.empty() ? true : false;
    }

    @Test
    public void swap(){
        int a=5;
        int b=8;
        System.out.println(String.format("a=%d,b=%d",a,b));
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(String.format("a=%d,b=%d",a,b));
    }
}
