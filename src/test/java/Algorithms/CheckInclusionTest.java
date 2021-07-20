package Algorithms;

import org.junit.Assert;
import org.junit.Test;

public class CheckInclusionTest {
    @Test
    public void testStr(){
        String str1 = "adc";
        String str2 = "dcda";
        boolean result1 = CheckInclusion.checkInclusion(str1, str2);
        Assert.assertEquals(result1, true);
        System.out.println(result1);
    }

    @Test
    public void testStr1(){
        String str1 = "adcr";
        String str2 = "dcda";
        boolean result1 = CheckInclusion.checkInclusion(str1, str2);
        Assert.assertEquals(result1, false);
        System.out.println(result1);
    }
}
