package com.itwang.recursion;

import java.util.Scanner;

/**
 * summation formula(求和公式)
 * （for循环）求100以内所有能被3整除的但不能被5整除的数字的和；
 */
public class SummationFormula {
    public static void main(String[] args) {
        loop:while(true){
            System.out.println("--------------自定义计算能被3整除的但不能被5整除的数字的和---------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择： 1.计算 2.退出");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("请您输入一个数：");
                    int number = sc.nextInt();
                    System.out.println(summationFormula(number));
                    break;
                case 2:
                    break loop;
                default:
                    System.out.println("错误，请检查！");
            }
        }
    }
    public static String summationFormula(int number){
        //求100以内所有能被3整除的但不能被5整除的数字的和；
        int count = 0;
        if (number < 0){
            return "请输入合法数字！！！建议您输入不小于0的数!!!";
        }
        if (number == 0){
            return "" + number;
        }
        for (int i = 1; i <= number; i++) {
              if (i % 3 == 0 && i % 5 != 0) {
                  count += i;
//                  System.out.println(i);
            }
        }
        return "自定义能被3整除的但不能被5整除的数字的和为：" + count;
    }
}
