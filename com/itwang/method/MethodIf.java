package com.itwang.method;

/**
 * 判断一个整数是奇数还是偶数，并且判断的结果输出出来
 */
public class MethodIf {
    public static void main(String[] args) {
        ifNumber(2);
    }
    public static void ifNumber(int num){
        if (num % 2 == 0){
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num+"是奇数");
        }
    }
}
