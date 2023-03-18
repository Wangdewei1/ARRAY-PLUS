package com.itwang.practice.day02;

/**
 * 需求1: 编写程序,判断一个学生成绩是否及格.
 * 需求2: 编写程序,获取2个整数的最大值\最小值.
 * 需求3: 编写程序,获取3个整数的最大值\最小值
 */
public class Test4 {
    public static void main(String[] args) {
        double score = 95;
        //规定大于或等于60为及格 0代表及格 1代表不及格
        System.out.println("成绩 ：" + ((score>=60) ? 0 : 1));

        System.out.println("---------------");
        int a = 100;
        int b = 200;
        System.out.println("两个整数中" + ((a > b) ? a : b) + "为最大值");

        System.out.println("----------------");
        int x = 100;
        int y = 200;
        int z = 300;
//        System.out.println(((x > y) ? x : y));
        System.out.println("三个整数中"+((x > y) ? x : ((y > z) ? y : z)) + "为最大值");
    }
}
