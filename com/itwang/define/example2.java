package com.itwang.define;

public class example2 {
    public static void main(String[] args) {
        int[] arrs = {11,22,33,44,55};
        changes(arrs);
    }
    public static void changes(int[] arrs){
        System.out.print("[");
        for (int i = 0; i < arrs.length; i++) {
            if (i == arrs.length-1){
                System.out.print(arrs[arrs.length-1]);
                break;
            }
            System.out.print(arrs[i]+",");
        }
        System.out.println("]");
    }
}
