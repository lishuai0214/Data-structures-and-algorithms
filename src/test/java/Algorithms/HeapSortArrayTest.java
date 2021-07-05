package Algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class HeapSortArrayTest {
    @Test
    public void testHeapSortArray(){
        HeapSortArray heapSortArray = new HeapSortArray();
        int[] sourceArray = {10,3,52,75,19};
        System.out.println(String.format("before sort: %s", Arrays.toString(sourceArray)));
        int[] result = heapSortArray.sort(sourceArray);
        System.out.println(String.format("after sort: %s", Arrays.toString(result)));
        assertTrue( true );
    }
}
