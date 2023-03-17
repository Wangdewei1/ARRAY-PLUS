package com.itwang.algorithm;

import java.util.Scanner;

/**
 * 二分查找改进版 练习
 */
public class Practice {
    public static void main(String[] args) {

        int[] arr ={1,4,7,10,33,44,66};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入要查找的值： ");
            int num = sc.nextInt();
            int number = sort(arr, num);
            System.out.println("您找的值在所在这组数的索引位置为： " + number);
            System.out.println("------------------");
        }
    }

    /**
     * arr 查找的一组数
     * des 您要查找的数
     * @param arr
     * @param des
     * @return
     */
    public static int sort(int[] arr , int des){
        int startIndex = 0; //开始索引
        int endIndex = arr.length - 1; //结束索引
        //不知道要循环多少次，用while ，条件是开始 索引数值 <= 结束索引 数值时候
        while (startIndex <= endIndex){
            int middleIndex = (startIndex + endIndex) >>> 1; //防止数组移溢出
            if (des == arr[middleIndex]){
                return middleIndex;
            }
            //取下限
            else if (des < arr[middleIndex]){
                endIndex = middleIndex - 1;
            }
            else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
