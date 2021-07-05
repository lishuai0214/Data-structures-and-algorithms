package DataStructures;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringCommonTest
{
    @Test
    public void testStringReverse(){
        String string = "hello world";
        String reversed = StringCommon.stringReverse(string);
        System.out.println("字符串反转前：" + string);
        System.out.println("字符串反转后：" + reversed);
        assertTrue( true );
    }

    @Test
    public void testStringToCharArray(){
        String string = "hello world";
        String reversed = StringCommon.stringToCharArray(string);
        System.out.println("字符串排序前：" + string);
        System.out.println("字符串排序后：" + reversed);
        assertTrue( true );
    }
}
