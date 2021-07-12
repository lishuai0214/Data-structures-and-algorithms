package Algorithms;

import java.util.Arrays;

/*
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。

示例 1：
输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
输出：[1,2,2,3,5,6]
示例 2：

输入：nums1 = [1], m = 1, nums2 = [], n = 0
输出：[1]

提示：
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[i] <= 109
*/

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0; i<n; i++) {
            int res = binSearchArray(nums1, m, nums2[i]);
            System.out.println(String.format("nums2[i]: %s, res: %s", nums2[i], res));
            if (res < m){
                for (int j=m; j>res; j--){
                    nums1[j] = nums1[j-1];
                }
            }
            nums1[res] = nums2[i];
            System.out.println(Arrays.toString(nums1));
            m++;
        }
    }

    public static int binSearchArray(int srcArray[], int lenght,int key) {
        int mid = lenght / 2;
        if (key == srcArray[mid]) {
            return mid;
        }

        int start = 0;
        int end = lenght - 1;
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
        return start;
    }
}
