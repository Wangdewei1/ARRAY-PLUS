package com.itwang.algorithm;

import java.util.Scanner;

/**
 * 二分查找法
 * <p>
 * （1）算法原理：
 * 又叫折半查找，要求待查找的序列有序。每次取中间位置的值与待查关键字比较，如果中间位置
 * 的值比待查关键字大，则在前半部分循环这个查找的过程，如果中间位置的值比待查关键字小，
 * 则在后半部分循环这个查找的过程。直到查找到了为止，否则序列中没有待查的关键字。
 */
public class BinarySearch {
    public static void main(String[] args) {
//        sort();
        int[] arr = {1,2,5,7,9,11,24,56};
        //您找的数值
        int num = sort1(arr, 11);
        System.out.println("您找的数值为： " + num);
    }

    public static int sort() {
        //1.键盘录入一组有序数字
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("请输入一组有序数组: ");
            int number = sc.nextInt();

            arr1[number] = arr1[i];

            System.out.println(arr1[i]);
        }
        //2.把这组有序数字存放到数组中
        //3.定义第一个索引，0 ，循环这个有序数组
        //4.循环取这个数组的中间值
        //5.每次待查数组的值和索引中间的值进行比较
        return -1;

        //error
    }

    //进阶版查找
    public static int sort1(int[] srcArray, int des) {
        //定义初始最小、最大索引
        int start = 0;
        int end = srcArray.length - 1;
        //确保不会出现重复查找，越界
        while (start <= end) {
            //计算出中间索引值  >>> 逻辑右移 也就是 int middle = (end + start)/2
            int middle = (end + start) >>> 1;//防止溢出
            if (des == srcArray[middle]) {
//                return middle;
                return srcArray[middle];
                //判断下限
            } else if (des < srcArray[middle]) {
                end = middle - 1;
                //判断上限
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}