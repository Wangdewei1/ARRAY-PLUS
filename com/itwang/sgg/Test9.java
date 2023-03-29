package com.itwang.sgg;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args){
//        int n = 100;
//        int units = n % 10;
//        int decade = n / 10 % 10;
//        int hundreds = n / 100 % 100;
//        System.out.println("个位："+ units + "\n十位：" + decade + "\n百位：" + hundreds);

        ifDivisor();
    }
    public static void ifDivisor(){
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.print("请输入您的选择： 1.判断运算 2.退出程序");
            System.out.println();
            int number = sc.nextInt();
            switch (number){
                case 1 -> {
                    System.out.print("请输入a的值：");
                    int a = sc.nextInt();
                    System.out.print("请输入b的值：");
                    int b = sc.nextInt();
                    boolean flag = (a % b == 0);
                    //如果为true b是a的因子，反之则不是
                    if (flag && a > b) {
                        System.out.println("b是a的因子");
                    } else {
                        System.out.println("b不是a的因子");
                    }
                    break;
                }
                case 2 -> {
                    break loop;
                }
                default -> System.out.println("您输入的有误，请输入有效数字");
        }

        }
    }
}
