package Coding;

import org.junit.Test;

import java.util.Arrays;

/*
977. 有序数组的平方
给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

示例 1：

输入：nums = [-4,-1,0,3,10]
输出：[0,1,9,16,100]
解释：平方后，数组变为 [16,1,0,9,100]
排序后，数组变为 [0,1,9,16,100]
示例 2：

输入：nums = [-7,-3,2,3,11]
输出：[4,9,9,49,121]


提示：

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums 已按 非递减顺序 排序


进阶：

请你设计时间复杂度为 O(n) 的算法解决本问题

 */

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        while (nums[0] < 0){
            int absNum = Math.abs(nums[0]);
            int count = 1;

            while (count < nums.length && nums[count] < absNum){
                nums[count-1] = nums[count];
                count++;
            }

            nums[count - 1] = absNum;
        }

        System.out.println("mid: " + Arrays.toString(nums));

        for (int i=0; i < nums.length; i++){
            nums[i] = (int) Math.pow(nums[i],2);
        }
        return nums;
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] > target){
                if (mid-1 < 0 || nums[mid-1] < target){
                    return mid;
                }else {
                    right = mid - 1;
                }
            }else if (nums[mid] < target){
                if (mid+1 > right ||nums[mid+1] > target){
                    return mid + 1;
                }else {
                    left = mid + 1;
                }
            }else if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    @Test
    public void testSortedSquares0(){
        int[] nums = {-4,-1,0,3,10};
        System.out.println("before: " + Arrays.toString(nums));

        int[] result = sortedSquares(nums);
        System.out.println("after: " + Arrays.toString(result));
    }

    @Test
    public void testSortedSquares01(){
        int[] nums = {-5,-3,-2,-1};
        System.out.println("before: " + Arrays.toString(nums));

        int[] result = sortedSquares(nums);
        System.out.println("after: " + Arrays.toString(result));
    }

    @Test
    public void testSortedSquares1(){
        int[]  nums = new int[]{-1};
        System.out.println("before: " + Arrays.toString(nums));

        int[] result = sortedSquares(nums);
        System.out.println("after: " + Arrays.toString(result));
    }
}
