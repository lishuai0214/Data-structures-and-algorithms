package Algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BinarySearchListTest {



    @Test
    public void testBinSearch1(){
        int[] nums = {-1,0,3,5,8,12};
        nums = new int[]{9};
        int result = BinarySearchArray.search(nums, 9);
        System.out.println(result);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testBinSearch2(){
        int[] nums = {-1,0,3,5,9,12};
        int[] result = BinarySearchArray.searchWithMiddleReturn(nums,0, nums.length, 1);
        System.out.println("nums:" + Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
        Assert.assertEquals(result[1], 4);
    }

    @Test
    public void testBinSearch3(){
        int[] nums = {-1,0,3,5,9,12};
        int result = BinarySearchArray.search(nums, 10);
        System.out.println(result);
        Assert.assertEquals(result, -1);
    }

    @Test
    public void testBinarySearchList(){
        int target = 4;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        int result = BinarySearchList.binarySearch1(list, target);
        System.out.println("list: " + list);
        System.out.println("target to find: " + target);
        System.out.println("result: " + result);
        assertTrue( result==2);
    }

    @Test
    public void testBinarySearchList1(){
        int target = 6;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        int result = BinarySearchList.binarySearch1(list, target);
        System.out.println("list: " + list);
        System.out.println("target to find: " + target);
        System.out.println("result: " + result);
        assertTrue( result == -1);
    }

    @Test
    public void test(){
        Integer a = 0;
        Integer b = 1;
        System.out.println(a.compareTo(b));
    }
}
