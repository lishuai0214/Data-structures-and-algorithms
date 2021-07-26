package Algorithms;

public class ClimbStairs {

    private int[] array = new int[10000];


    /*
        70. 爬楼梯
        假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

        每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

        注意：给定 n 是一个正整数。

        示例 1：

        输入： 2
        输出： 2
        解释： 有两种方法可以爬到楼顶。
        1.  1 阶 + 1 阶
        2.  2 阶
        示例 2：

        输入： 3
        输出： 3
        解释： 有三种方法可以爬到楼顶。
        1.  1 阶 + 1 阶 + 1 阶
        2.  1 阶 + 2 阶
        3.  2 阶 + 1 阶
     */

    public int climbStairs(int n) {
        int rn_1;
        int rn_2;

        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        if (n == 2){
            return 2;
        }

        if (array[n - 1] == 0) {
            rn_1 = climbStairs(n - 1);
            array[n - 1] = rn_1;
        }else {
            rn_1 = array[n - 1];
        }

        if (array[n - 2] == 0) {
            rn_2 = climbStairs(n - 2);
            array[n - 2] = rn_2;
        }else {
            rn_2 = array[n - 2];
        }

        return  rn_1 + rn_2;
    }
}
