package Coding;

import Algorithms.TwoSum;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {
    @Test
    public void towSumTest(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
