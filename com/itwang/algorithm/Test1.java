package com.itwang.algorithm;

import java.util.Scanner;

/**
 * 冒泡排序 测试
 */
public class Test1 {
    public static void main(String[] args) {
        bubbleSort();
    }
    public static void bubbleSort(){
        Scanner sc = new Scanner(System.in);
        //定义一个动态初始化数组
        int sort[] = new int[10];
        //空盒子转换
        int temp;
        System.out.println("请输入10个排序的数据：");
        //将打印的数字 一一的放在动态初始化数组容器
        for (int i = 0; i < sort.length; i++) {
            sort[i] = sc.nextInt();
        }
        //比较相邻的两个数，倒序的情况 判断 前一个数是否小于后一个数 ，true就根据条件交换位置
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) 			{
                if (sort[j] < sort[j + 1]) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        //打印排序后的数组
        System.out.println("排列后的顺序为：");
        for(int i=0;i<sort.length;i++){
            System.out.print(sort[i]+"   ");
        }
    }
}
