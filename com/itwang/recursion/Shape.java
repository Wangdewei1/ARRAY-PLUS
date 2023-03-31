package com.itwang.recursion;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("请选择：1.打印金字塔 2.退出");
            int num = sc.nextInt();
            switch (num){
                case 1 ->{
                    System.out.print("请输入一个整数：");
                    int number = sc.nextInt();
                    for (int i = 1; i <= number; i++) {
                        for (int j = i; j < number; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                case 2 ->{
                    break loop;
                }
                default -> System.out.println("错误！请检查！！！");
            }
        }
    }
}
