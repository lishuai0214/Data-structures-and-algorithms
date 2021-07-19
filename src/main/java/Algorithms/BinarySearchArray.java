package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchArray {

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int left, int right, int target) {
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] > target){
                return search(nums, left, mid- 1, target);
            }else if (nums[mid] < target){
                return search(nums, mid + 1, right, target);
            }else if (nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }

    public static int[] searchWithMiddleReturn(int[] nums, int left, int right, int target) {
        int[] result = new int[2];
        int mid = (left + right)/2;
        while (left <= right){
            if (nums[mid] > target){
                return searchWithMiddleReturn(nums, left, mid- 1, target);
            }else if (nums[mid] < target){
                return searchWithMiddleReturn(nums, mid + 1, right, target);
            }else if (nums[mid] == target){
                result[0] = 1;
                result[1] = mid;
                return result;
            }
        }
        if (result[1] == 0){
            result[1] = mid;
        }

        return result;
    }

    public static void main( String[] args )
    {
        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(7);
        c.add(9);
        int result = BinarySearchArray.binarySearch(c, 4);
        System.out.println(result);
    }

    public static int binSearch(int srcArray[], int key) {
        int mid = srcArray.length / 2;
        if (key == srcArray[mid]) {
            return mid;
        }

        int start = 0;
        int end = srcArray.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (key < srcArray[mid]) {
                end = mid - 1;
            } else if (key > srcArray[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch(List<Integer> numArray, Integer n){
        int mid = numArray.size()/2;
        if (n == numArray.get(mid)) {
            return mid;
        }

        int left = 0;
        int right = numArray.size() - 1;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (n < numArray.get(mid)) {
                right = mid - 1;
            } else if (n > numArray.get(mid)) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
