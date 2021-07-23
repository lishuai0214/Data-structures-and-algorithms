package Algorithms;

import org.junit.Test;

import java.util.Arrays;

public class LengthOfLISTest {
    public int lengthOfLIS(int[] nums) {
        int[] res = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            int idx = Arrays.binarySearch(res, 0, len, num);
            idx = idx < 0? -idx - 1: idx;
            res[idx] = num;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }

    @Test
    public void testLengthOfLIS(){
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = lengthOfLIS(nums);
        System.out.println(String.format("result: %s", result));
    }
}
