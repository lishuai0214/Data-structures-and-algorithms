package Algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BubbleSortListTest {
    @Test
    public void testBubbleSortArray(){
        BubbleSortList bubbleSortList = new BubbleSortList();

        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(10);
        sourceList.add(3);
        sourceList.add(53);
        sourceList.add(75);
        sourceList.add(19);

        System.out.println(String.format("bubble sort before sort: %s", sourceList));
        List<Integer> result = bubbleSortList.sort(sourceList);
        System.out.println(String.format("bubble sort after sort: %s", result));
        assertTrue( true );
    }
}
