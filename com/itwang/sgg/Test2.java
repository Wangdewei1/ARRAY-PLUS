package com.itwang.sgg;

import java.util.Scanner;

/**
 * 2.年份是否为闰年
 */
public class Test2 {
    public static void main(String[] args) {
        //2.
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("请输入年份：");
            int year = sc.nextInt();
            if ((year%4==0 && year%100 !=0) || year%400 == 0){
                System.out.println(year + " 为闰年");
            }else {
                System.out.println(year + "不是闰年");
            }
        }
    }
}
