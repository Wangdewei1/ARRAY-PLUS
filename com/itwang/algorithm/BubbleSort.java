package com.itwang.algorithm;

import java.util.Scanner;

/**
 *
 *  冒泡排序
 *  （1）算法原理：
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
 */
public class BubbleSort {
    public static void main(String[] args) {
        sort();
    }
    public static void sort() {
        //定义一个动态初始化数组
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入排序前的数组： ");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            //将打印的数组一一存放在 定义的数组容器
            arr[i] = sc.nextInt();
        }
        /**
         * =======空盒子转换=======
         * { 3 , 6 , 1 , 10 , 7} arr.length = 5;
         *  第一个数 ： i = 0 -- > arr[0] = 3; 0 < 5 -- > 第二个数： j = 1 -- > arr[1] = 6 ; 1 < 5
         *             arr[0] < arr[1]
         *             i = 1 -- > arr[1] = 6 ; 1 < 5 -- >    j = 2 -- > arr[2] = 1 ; 6 > 1
         *             arr[j] = 6 -- > arr[i] = 1 -- >
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 -i ; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j]  ;
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        //打印排序后数组
        for (int i = 0; i < arr.length; i++) {
//            System.out.println("排序后的数组为： ");
            System.out.print(arr[i]);
        }
    }
}
