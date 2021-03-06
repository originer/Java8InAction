package com.horizon.leetcode.algorithms;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 数值有规律
 * Created by Horizon on 2018/9/8.
 */
public class Problem70 {

    /*递归*/
    //public static int climbStairs(int n) {
    //    int re = 0;
    //    if (n == 1 || n == 0) {
    //        return 1;
    //    } else {
    //        re = climbStairs(n - 1) + climbStairs(n - 2);
    //    }
    //    return re;
    //}

    /*非递归*/
    public static int climbStairs(int n) {
        int re = 0, a = 1, b = 1;
        if (n == 1 || n == 0) {
            return 1;
        }
        while (n > 1) {
            re = a + b;
            a = b;
            b = re;
            n--;
        }
        return re;
    }
}
