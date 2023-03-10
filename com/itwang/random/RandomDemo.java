package com.itwang.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏
 * 需求：
 * 随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，知道猜中结束
 */
public class RandomDemo {
    public static void main(String[] args) {
        //1.键盘输入猜的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您猜的数字：");
        int number = sc.nextInt();
        //2.生成1-100之间的数据
        int randomNumber = 0;
            Random r  = new Random();
            randomNumber = r.nextInt(100)+1;
            System.out.println(randomNumber);
        //3.比较猜的数字和生成的数据并判断
        if (randomNumber == number){
            System.out.println("您猜对了");
        } else if (randomNumber < number) {
            System.out.println("太大了");
        }else {
            System.out.println("太小了");
        }
    }

}
