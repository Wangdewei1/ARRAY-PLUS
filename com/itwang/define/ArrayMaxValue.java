package com.itwang.define;

/**
 * 数组求最值
 */
public class ArrayMaxValue {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] numbers = {33,22,10,-1,99,88,1000,-20};
        //2.在这个数组中，找第一个索引作为max最大值
        int max = numbers[0];
        //3.比较这组数据
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
