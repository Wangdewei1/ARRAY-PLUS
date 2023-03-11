package com.itwang.define;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机排序
 */
public class ArrayNotSort {
    public static void main(String[] args) {
        //1.定义一个动态初始化数组录入工号
        int[] arr = new int[5];
        //2.键盘输入工号并保存
        Scanner sc = new Scanner(System.in);
        //3.遍历每一个工号
        //4.交换索引 ， 打乱顺序
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入员工工号：");
            int number = sc.nextInt();
            arr[i] = number;
        }
        //5.打乱数组中的顺序
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int num = r.nextInt(arr.length);
            int temp = arr[num];
            arr[num] = arr[i];
            arr[i] = temp;
        }
        //6.遍历工号
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
