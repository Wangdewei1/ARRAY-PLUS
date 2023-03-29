package com.itwang.sgg;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loop:while(true){
            System.out.println("----------------判断是否为闰年-------------------");
            System.out.print("请输入您的选择：1.判断年份 2.退出程序");
            System.out.println();
            int num = sc.nextInt();
            switch (num){
                case 1 ->{
                    System.out.println("请输入年份：");
                    int year = sc.nextInt();
                    System.out.println(ifLeap(year));

                }
                case 2 -> {
                    break loop;
                }
                default -> System.out.println("错误 错误，请检查！");
            }
        }

    }
    public static String ifLeap(int year){
        if(year % 4 == 0 && year % 100 != 0){
            return year + "为闰年";
        }
        if(year % 100 == 0 && year % 400 == 0){
            return year + "为闰年";
        }
     return year + "不是闰年";
    }
}
