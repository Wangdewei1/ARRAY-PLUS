package com.itwang.stringTest;

/**
 * 导包 API
 */
public class Demo {
    public static void main(String[] args) {
        String str = "刘大爷";
        System.out.println(str);

        String str1 = new String("王二娘");
        System.out.println(str1);
        System.out.println("---------------");

        char[] ch = {'a','b','c'};
        String rg1 = new String(ch);
        System.out.println(rg1);
        System.out.println("--------------------");

        byte[] bytes = {65,66,67};
        String rg2 = new String(bytes);
        System.out.println(rg2);
    }
}
