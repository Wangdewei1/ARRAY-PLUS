package com.itwang.sgg;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loop:while(true){
            System.out.println("-------------测试系统-------------");
            System.out.print("1.判断 2.退出程序");
            System.out.println();
            int num = sc.nextInt();
            switch(num){
                case 1 -> {
                    System.out.print("请输入一个整数: ");
                    int number = sc.nextInt();
                    System.out.println(ifOneByFive(number));
                    break;
                }
                case 2 -> {
                    break loop;
                }
            }
        }
    }
    public static String ifOneByFive(int number){
        if(number >= 1 && number <=5){
            return "贝贝 晶晶 欢欢 莹莹 尼尼";
        }else{
            return "北京欢迎你";
        }
    }
}
