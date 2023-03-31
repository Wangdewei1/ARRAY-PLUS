package com.itwang.recursion;

/**
 * （for循环）编程找出四位整数abcd中满足(ab+cd)(ab+cd) = abcd 的数？
 */
public class FourIntNumber {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        //验算第一次： ab = 10 ； cd = 99   10 + 99 * 10 + 99 = 10 + 990 + 99 = 1099;
        for (int i = 1000; i <= 9999 ; i++) {
            int a = i / 1000 ;
            int b = i / 100 % 10;
            int c = i / 10 % 10;
            int d = i % 10;
            int ab = i / 100;
            int cd = i % 100;
            if (ab + cd * ab + cd == i){
                System.out.println("这个四位数为：" + i);
            }
        }
    }
}
