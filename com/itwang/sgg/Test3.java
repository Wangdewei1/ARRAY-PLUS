package com.itwang.sgg;

import java.util.Scanner;

/**
 * 3.判断一个整数是奇数还是偶数
 */
public class Test3 {
    public static void main(String[] args) {
        //3.
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("-------------判断一个整数是奇数还是偶数--------------");
            System.out.println("请选择您要操作的数字");
            System.out.println("1.请输入要判断的数字");
            System.out.println("2.退出判断");
            int number = sc.nextInt();
            switch (number){
                case 1 -> {
                    System.out.println("请输入要判断的数字：");
                    int num = sc.nextInt();
                    System.out.println(isIntNumber(num));
                }
                case 2 -> {
                    System.out.println("已退出");
                    break loop;
                }
                default ->
                        System.out.println("系统错误");
            }
        }
    }
    public static String isIntNumber(int number){
        if (number % 2==0){
            return number + "：为偶数";
        }else {
            return number + "：为奇数";
        }
    }
}
