package Algorithms;

import org.junit.Assert;
import org.junit.Test;

public class RomanAndIntTest {

    @Test
    public void testRomanToInt1(){
        RomanAndInt romanAndInt = new RomanAndInt();
        int result = romanAndInt.romanToInt("IV");
        System.out.println("romanToInt result: " + result);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void testRomanToInt2(){
        RomanAndInt romanAndInt = new RomanAndInt();
        int result = romanAndInt.romanToInt("III");
        System.out.println("romanToInt result: " + result);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testRomanToInt3(){
        RomanAndInt romanAndInt = new RomanAndInt();
        int result = romanAndInt.romanToInt("IX");
        System.out.println("romanToInt result: " + result);
        Assert.assertEquals(result, 9);
    }

    @Test
    public void testRomanToInt4(){
        RomanAndInt romanAndInt = new RomanAndInt();
        int result = romanAndInt.romanToInt("LVIII");
        System.out.println("romanToInt result: " + result);
        Assert.assertEquals(result, 58);
    }

    @Test
    public void testRomanToInt5(){
        RomanAndInt romanAndInt = new RomanAndInt();
        int result = romanAndInt.romanToInt("MCMXCIV");
        System.out.println("romanToInt result: " + result);
        Assert.assertEquals(result, 1994);
    }
}
