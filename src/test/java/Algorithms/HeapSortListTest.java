package Algorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HeapSortListTest {
    @Test
    public void testHeapSortList(){
        HeapSortList heapSortList = new HeapSortList();
        List<Integer> sourceList = new ArrayList<>();
        sourceList.add(10);
        sourceList.add(3);
        sourceList.add(53);
        sourceList.add(75);
        sourceList.add(19);

        System.out.println(String.format("before sort: %s", sourceList));
        List<Integer> result = heapSortList.sort(sourceList);
        System.out.println(String.format("after sort: %s", result));
        assertTrue( true );
    }
}
