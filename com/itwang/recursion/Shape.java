package com.itwang.recursion;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
