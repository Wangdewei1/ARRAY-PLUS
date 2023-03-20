package com.itwang.springbuilder;

public class SpringBuilderDemo4 {
    public static void main(String[] args) {
        System.out.println(method1());
    }
    public static boolean method1(){
        String str1 = "abcde";
        String str2 = "bcdea";
        for (int i = 0; i < str1.length(); i++) {
            str1 = method(str1);
            if (str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
    public static String method(String str){

        char c = str.charAt(0);
        String s = str.substring(1);

        return s + c;

    }
}
