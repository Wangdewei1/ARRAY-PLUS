package com.itwang.define;

import java.util.Scanner;

/**
 * 数组实例
 * 某培训班，有6名评委，要求给学生打成绩，为求六名评委给的平均分数
 * 数组求和问题
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //1.定义六名评委给出的成绩容器
        double[] scores = new double[6];
//        System.out.println(scores[1]);
        //2.每次每个评委给出的成绩
        //3.定义求和变量sum
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个评委给的分数:");
            double score = sc.nextDouble();
            scores[i] = score;
            sum += scores[i];
        }
        System.out.println("平均分数为："+ (sum / scores.length));
    }
}
