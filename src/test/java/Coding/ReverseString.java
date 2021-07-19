package Coding;

import org.junit.Test;

import java.util.Arrays;

public class ReverseString {
    public void reverseString(char[] s) {
        int lenght = s.length;
        for (int i=0; i<lenght/2; i++){
            char temp = s[i];
            s[i] = s[lenght - i - 1];
            s[lenght - i -1] = temp;
        }
    }

    @Test
    public void reveseStr(){
        char[] strArray = {'h','e','l','l','o'};
        System.out.println("before: " + Arrays.toString(strArray));
        reverseString(strArray);
        System.out.println("after: " + Arrays.toString(strArray));
    }
}
