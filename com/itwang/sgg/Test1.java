package com.itwang.sgg;

import java.util.Scanner;

/**
 * 1.成绩在【0，100】范围内，一个数要么是3的倍数要么是56的倍数，年份是否为闰年
 * 2.判断一个整数是奇数还是偶数
 */
public class Test1 {
    public static void main(String[] args) {
     //1.
        System.out.println("----------判断成绩是否在0——100内----------");
        Scanner sc = new Scanner(System.in);
        loop : while (true) {
            System.out.print("请输入您的成绩:");
            double score = sc.nextDouble();
            if (score <= 100 && score > 0){
                System.out.println(score + " 分满足0——100内");
                break loop;
            }else {
                System.out.println(score + " 分不满足0——100内，请重新输入:");
            }
        }
    }
}
