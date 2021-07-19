package Algorithms;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public void moveZeroes(int[] nums) {
        int lenght = nums.length;
        int left = 0;
        int end = 0;
        while (left < lenght && nums[left] != 0){
            left++;
        }
        end = left;
        while (end < lenght && nums[end] == 0){
            end++;
        }


        while (end < lenght){
            int temp = nums[left];
            nums[left] = nums[end];
            nums[end] = temp;
            left++;
            System.out.println("1:" + Arrays.toString(nums));
            while (end < lenght && nums[end] == 0){
                end++;
            }
        }
        System.out.println("2: " + Arrays.toString(nums));
    }
}
