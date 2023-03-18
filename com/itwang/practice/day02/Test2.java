package com.itwang.practice.day02;

public class Test2 {
    public static void main(String[] args) {
        int number = 1002;

        int geWei = number % 10; //这个四位数的个位
        int shiWei = number / 10 % 10;
        int baiWei = number / 100 % 10;
        int qianWei = number / 1000 % 10;
        System.out.println("个位 = " + geWei);
        System.out.println("十位 = " + shiWei);
        System.out.println("百位 = " + baiWei);
        System.out.println("千位 = " + qianWei);

    }
}
