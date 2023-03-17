package com.itwang.algorithm;

public class Test {
    public static void main(String[] args) {
        int num  = -100;
        for (int i = 1; i < 20; i++) {
//            System.out.println(num + "<<" + i + "=" + (num << i));
//            System.out.println("--------------------");
//            System.out.println(num + ">>" + i + "=" + (num >> i));
        }
//        method();
        method1();
    }
    public static void method(){
        int num = -39;
        System.out.println(num >> 1);
    }
    public static void method1(){
        int num = 32;
        for (int i = 1; i <= num+1; i++) {
            System.out.println(num + ">>>" + i + "=" + (num >>> i));
        }
    }
}
