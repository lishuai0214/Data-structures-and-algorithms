package Algorithms;

import org.junit.Test;

public class StringAlgorithmsTest {
    @Test
    public void testlengthOfLongestSubstring(){
        String str = "aabcdelefghigkkkkk888";
        str = "l";
        int result = StringAlgorithms.lengthOfLongestSubstring(str);
        System.out.println("result: " + result);
    }
}
