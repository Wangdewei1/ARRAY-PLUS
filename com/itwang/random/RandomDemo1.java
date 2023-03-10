package com.itwang.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数游戏 进阶版
 */
public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(100)+1; //生成1-100随机数
        System.out.println(randomNumber);
        //猜错一直循环
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您猜的数字:");
            int number = sc.nextInt();
            if (number < randomNumber) {
                System.out.println("太小了");
            }
            else if (number > randomNumber) {
                System.out.println("太大了");
            } else {
                System.out.println("您猜对了");
                break;
            }
        }
    }
}
