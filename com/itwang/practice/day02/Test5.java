package com.itwang.practice.day02;

import java.util.Scanner;

/**
 * 需求: 键盘录入用户输入的年龄和姓名,打印输出
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄： ");
        int age = sc.nextInt();
        System.out.println("姓名："+name +"\n"+"年龄："+ age);
    }
}
