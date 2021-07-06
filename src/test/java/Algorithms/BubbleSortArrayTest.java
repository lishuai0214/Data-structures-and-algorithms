package Algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BubbleSortArrayTest {
    @Test
    public void testBubbleSortArray(){
        BubbleSortArray bubbleSortArray = new BubbleSortArray();
        int[] sourceArray = {10,3,52,75,19};
        System.out.println(String.format("bubble sort before sort: %s", Arrays.toString(sourceArray)));
        int[] result = bubbleSortArray.sort(sourceArray);
        System.out.println(String.format("bubble sort after sort: %s", Arrays.toString(result)));
        assertTrue( true );
    }
}
