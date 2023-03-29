package com.itwang.sgg;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("请输入您的选择: 1.计算税款 2.退出程序");
            int number = sc.nextInt();
            switch (number){
                case 1 -> {
                    System.out.println("请输入税前钱：");
                    double revenueF = sc.nextDouble();
                    System.out.println("税后：" + revenueCalculate(revenueF));
                }
                case 2 -> {
                    break loop;
                }
                default -> System.out.println("输入错误，请仔细检查！");
            }
        }
    }
    public static double revenueCalculate(double revenue){
/*        if(revenue < 1500){
            return revenue;
        }*/
        if(revenue == 1500){
//            return 1500 * (1-0.03);
            return 1500 - (1500 - 262) * 0.03;
        }
        if(revenue >= 1501 && revenue <= 4500){
            return revenue - (revenue - 262 - 105)* 0.1;
        }
        if(revenue >= 4501 && revenue <= 9000){
            return revenue - (revenue - 262 -555)* 0.2;
        }
        if(revenue >= 9001 && revenue <= 35000){
            return revenue - (revenue - 262 - 1005)* 0.25;
        }
        if(revenue >= 35001 && revenue <= 55000){
            return revenue - (revenue - 262 - 2755) * 0.3;
        }
        if(revenue >= 55001 && revenue <= 80000){
            return revenue - (revenue - 262 - 5505) * 0.35;
        }
        if(revenue > 80000){
            return revenue - (revenue - 262 - 1350) * 0.45;
        }
        return revenue;
    }
}
