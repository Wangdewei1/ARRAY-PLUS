package com.itwang.springbuilder;

import java.util.Scanner;

/**
 * springbulider 练习
 */
public class SpringBuilderDemo {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入一个字符串： ");
            String str = sc.next();
            StringBuilder sb = new StringBuilder();
            String result = sb.append(str).reverse().toString();
            System.out.println(result);
//            if ((sb.reverse().toString()) == (sb.toString())){
//                System.out.println("您输入的是对称字符串");
//                System.out.println("-------------------");
//            }else {
//                System.out.println("您输入的不是字符串");
//                System.out.println("--------------------");
//            }
            if (result.equals(str)){
                System.out.println("您输入的是对称字符串");
            }else {
                System.out.println("您输入的不是字符串");
            }
        }
    }}
