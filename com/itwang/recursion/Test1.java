package com.itwang.recursion;

/**
 * (for循环) 1 + 3 + 5+...+99的和？
 */
public class Test1 {
    public static void main(String[] args) {
        //定义一个变量
        int count = 0;
        //遍历 1 3 5 7 ... 99 的每个数字
        for (int i = 1; i <= 50; i++) {
            count = count + (2*i-1);
        }
        //把1 + 3 + 5 +...+99和赋值给result
        int result = count;
        System.out.println("1 + 3 + 5 +...+99 = " + result);
    }
}
