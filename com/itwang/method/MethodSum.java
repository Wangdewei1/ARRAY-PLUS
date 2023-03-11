package com.itwang.method;

/**
 * 求1-n的和？
 */
public class MethodSum {
    public static void main(String[] args) {
        System.out.println(sum(2));
    }
    public static int sum(int n){
        //1.定义1-n的变量sum
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
