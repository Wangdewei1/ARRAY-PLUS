package com.itwang.recursion;

import java.util.Scanner;
/**
 *  读入一个小于10的整数n，输出她的阶乘n； factorial（阶乘）
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("---------------计算一个整数的阶乘------------------");
            System.out.println("请您输入您的选择 1.求一个整数的阶乘 2.退出程序");
            int num = sc.nextInt();
            switch (num){
                case 1 -> {
                    System.out.println("请您输入一个整数：");
                    int number = sc.nextInt();
                    System.out.println(factorialMethod(number));
                }
                case 2 ->{
                    break loop;
                }
                default -> System.out.println("输入有误！检查检查");
            }
        }
    }
    public static String factorialMethod(int number){

        int count = 1;
        if (number < 0){
            return "负数没有！！";
        }
        if (number == 0){
            return "0的阶乘为：" + number;
        }
        for (int i = 1; i <= number; i++) {
            if (number > 0){
                count *= i;
            }
        }
        int result = count;
        return number + "的阶乘为：" + result;
    }
}
