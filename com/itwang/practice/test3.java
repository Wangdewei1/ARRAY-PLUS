package com.itwang.practice;

public class test3 {
    //1.需求1: 假设你现在有188.8元，一会要发100元，再收20元，请编写程序实现余额的变化过程。
    public static void main(String[] args){
        //double nowMoney = 188.8;
        method(188.8);
    }
    public static void method(double nowMoney){
        System.out.println("========公交系统======");
        int a = 100;
        int b = 20;
        System.out.println(1.0*(nowMoney - a + b));
    }
}
