package com.xrq.algorithm.sort;

import java.util.Arrays;

/**
 * @author ：rqxiao
 * @description：快速排序
 * @date ：2020/11/2 17:31
 *
 *
 *
 * 主要有三个变量
 *
 * p 此轮排序中最右边的元素作为基准元素
 *
 * a[j] 寻找比 p 小的元素
 *
 * a[i] 分割两边的数组，在他左边的比p小，从他自己开始比p大
 *
 * 单边排序 .选择最右边的元素作为基准元素，从左往右找 比 基准元素小的元素,
 *
 * 一轮快排结束后 ，i和 p 互换位置，每一轮都可以将 p 的 位置确定下来,方法返回p的索引值
 *
 * 然后递归快排继续 p左右两边的数组
 */
public class QuickSort {

    public static void quick(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(a, l, h); // p 索引值
        quick(a, l, p - 1); // 左边分区的范围确定
        quick(a, p + 1, h); // 左边分区的范围确定
    }

    public static int partition(int[] a, int low, int high) {

        int p = a[high];

        int i = low;

        for (int j = low; j < high; j++) {
            if (a[j] < p) {
                swap(a, j, i);
                i++;
            }
        }

        swap(a, high, i);
        System.out.println(Arrays.toString(a) + " i=" + i);

        return i;
    }

    public static void swap(int[] a, int z, int x) {
        int tmp = a[z];
        a[z] = a[x];
        a[x] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 2, 9, 8, 1, 4};


        quick(array, 0, array.length - 1);


    }


}
