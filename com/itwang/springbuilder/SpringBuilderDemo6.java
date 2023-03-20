package com.itwang.springbuilder;

import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 打乱字符数组 error错误的
 */
public class SpringBuilderDemo6 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入字符串:");
        String s = sc.next();
        System.out.println(luanStr(s));
    }
    public static String luanStr(String str){
        Random r = new Random();
        char[] chars = str.toCharArray();
//        char c1 = chars[0];
        int num;
        for (int i = 0; i < str.length(); i++) {
            num = r.nextInt(str.length() - 1);
            chars[num] = chars[i];
        }
//        chars[str.length()-1] = c1;
        String s = new String(chars);
        return s;
    }
}
