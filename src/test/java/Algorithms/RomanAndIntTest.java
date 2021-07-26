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

    @Test
    public void testIntToRoman1(){
        RomanAndInt romanAndInt = new RomanAndInt();
        String result = romanAndInt.intToRoman(1994);
        System.out.println("intToRoman result: " + result);
        Assert.assertEquals(result, "MCMXCIV");
    }

    @Test
    public void testIntToRoman2(){
        RomanAndInt romanAndInt = new RomanAndInt();
        String result = romanAndInt.intToRoman(3);
        System.out.println("intToRoman result: " + result);
        Assert.assertEquals(result, "III");
    }

    @Test
    public void testIntToRoman3(){
        RomanAndInt romanAndInt = new RomanAndInt();
        String result = romanAndInt.intToRoman(4);
        System.out.println("intToRoman result: " + result);
        Assert.assertEquals(result, "IV");
    }

    @Test
    public void testIntToRoman4(){
        RomanAndInt romanAndInt = new RomanAndInt();
        String result = romanAndInt.intToRoman(9);
        System.out.println("intToRoman result: " + result);
        Assert.assertEquals(result, "IX");
    }

    @Test
    public void testIntToRoman5(){
        RomanAndInt romanAndInt = new RomanAndInt();
        String result = romanAndInt.intToRoman(58);
        System.out.println("intToRoman result: " + result);
        Assert.assertEquals(result, "LVIII");
    }
}
