package com.itwang.method;

/**
 * 值传递
 */
public class MethodValueTraffort {
    public static void main(String[] args) {
        int a = 10;
        changes(a);
        System.out.println(a);
        changes(a);
    }
    public static void changes(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);

    }}
