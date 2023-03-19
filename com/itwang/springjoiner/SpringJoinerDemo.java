package com.itwang.springjoiner;

import java.util.StringJoiner;

public class SpringJoinerDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(method(arr));
    }
    public static String method(int[] arr){
        StringJoiner sj = new StringJoiner(" , ","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }
}
