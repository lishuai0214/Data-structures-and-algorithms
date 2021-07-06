package Algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BinarySearchListTest {
    @Test
    public void testBinarySearchList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        int result = BinarySearchList.binarySearch(list, 4);
        System.out.println("result: " + result);
        assertTrue( true );
    }
}
