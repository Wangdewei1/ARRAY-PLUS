package com.itwang.practice;

/**
 * 第一天作业
 */
public class test {
    public static void main(String[] args){
        //a = 20; b定义了重复的变量；b没有初始化值
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }

        // 片段2
        {
            int b = 20;
            System.out.println(b);
        }
        int b = 30;
        System.out.println(b);
    }
}
