package com.itwang.recursion;

/**
 * (for循环) 1+2+3+...+100 ?
 */
public class Test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count = count + i;
        }
        int result = count;
        System.out.println("1+2+3+...+100 = " + result);
    }
}
