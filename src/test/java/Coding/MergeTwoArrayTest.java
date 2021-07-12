package Coding;

import Algorithms.MergeTwoSortedArray;
import org.junit.Test;

public class MergeTwoArrayTest {

    @Test
    public void testMerge(){
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        MergeTwoSortedArray.merge(nums1, m, nums2, n);
    }
}
