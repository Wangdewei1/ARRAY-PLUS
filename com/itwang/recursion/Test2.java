package com.itwang.recursion;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + "x" + j + "=" + (i*j) +" ");
            }
            System.out.println();
        }
    }
}
