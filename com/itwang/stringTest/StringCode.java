package com.itwang.stringTest;

import java.util.Random;

/**
 * String验证码案例
 */
public class StringCode {
    public static void main(String[] args) {
        System.out.println(code(4));
        System.out.println(code(6));
    }
    public static String code(int n){
        String code = "";
        String str = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(str.length());
            code += str.charAt(index);
        }
        return code;
    }
}
