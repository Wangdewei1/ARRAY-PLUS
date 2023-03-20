package com.itwang.springbuilder;

public class SpringBuilderDemo5 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    public static boolean method(){
        String str1 = "abcde";
        String str2 = "eabcd";

        for (int i = 0;i<str1.length();i++) {
            str1 = charMethod(str1);
            if (str1.equals(str2)){
                return true;
            }
        }
        return false;

    }
    public static String charMethod(String str1){
        char[] c = str1.toCharArray();
        char c1 = c[0];
        for (int i = 1; i < str1.length(); i++) {
            c[i-1] = c[i];
        }
        c[c.length-1] = c1;
        String str3 = new String(c);
        return str3;
    }
}
