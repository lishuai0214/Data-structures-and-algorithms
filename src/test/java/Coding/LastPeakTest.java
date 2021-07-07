package Coding;

/*
描述
山峰元素是指其值大于或等于左右相邻值的元素。给定一个输入数组nums，任意两个相邻元素值不相等，数组可能包含多个山峰。找到索引最大的那个山峰元素并返回其索引。
假设 nums[-1] = nums[n] = -∞。

示例1
输入：[2,4,1,2,7,8,4]
返回值：5
*/

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class LastPeakTest {
    /**
     * 寻找最后的山峰
     * @param a int整型一维数组
     * @return int整型
     */
    public int solve (int[] a) {
        // write code here
        int result = -1;

        //注意题目条件nums[-1] = nums[n] = -∞
        if (a[0] > a[1]){
            result = 0;
        }

        System.out.println(Arrays.toString(a));
        for (int i=1; i<a.length-1; i++){
            if (a[i] > a[i-1] && a[i] > a[i+1]){
                result = i;
            }
        }

        //注意题目条件nums[-1] = nums[n] = -∞
        if (a[a.length-1] > a[a.length -2]){
            result = a.length-1;
        }

        return result;
    }

    @Test
    public void testBinarySearchList(){
        int[] a = {1, 2, 5, 8, 6, 4, 1, 7, 5};
        int result = solve(a);
        System.out.println("result: " + result);
        assertTrue( true );
    }
}
