package com.itwang.practice.day02;

public class Test1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 3;
        long lNum = 7;

        //1.小转大 自动类型转换
        short s1 = b;
        long l1 = s;
        //2.强制类型转换
        short s2 = (short)lNum;
    }
}
