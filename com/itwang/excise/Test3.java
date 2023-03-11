package com.itwang.excise;

import java.util.Scanner;

/**
 * 评委打分案例
 * 唱歌比赛 【0-100】 去最高分和最低分 取剩余平均分
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("获取的平均分数为：" + getAvgScore(3));
    }
    //num 评委个数
    public static double getAvgScore(int num){
        //1.定义一个数组容器
        int[] arr = new int[num];
        //2.键盘录入每个评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请您输入第"+(i+1)+"的分数：");
            int score = sc.nextInt();
            arr[i] = score;
        }
        //3.去掉最大值最小值
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //求和
            sum += arr[i];
            //最大值
            if (max < arr[i]){
                max = arr[i];
            }
            //最小值
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return 1.0*(sum-max-min)/(num-2);
    }
}
