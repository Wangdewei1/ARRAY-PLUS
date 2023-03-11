package com.itwang.define;

public class example1 {
    public static void main(String[] args) {
        int[] arrs = new int[]{12,20,30};
        array(arrs);
        System.out.println(arrs[1]);
    }
    public static void array(int[] arrs){

        System.out.println(arrs[1]);
        arrs[1] = 222;
        System.out.println(arrs[1]);

    }}
