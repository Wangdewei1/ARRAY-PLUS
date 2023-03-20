package com.itwang.springbuilder;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * jdk12 后 罗马数字进阶
 */
public class SpringBuilderDemo3 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        String str;
        StringJoiner sj = new StringJoiner(" ","","");
        while (true) {
            System.out.println("请您输入一个字符串：");
            str = sc.next();
            boolean flag = check(str);
            if (flag){
                break;
            }else {
                System.out.println("你输入的字符串有错误，请重新输入：");
                continue;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = checkLuoMa(c);
            sj.add(s);
        }
        System.out.print("转换的罗马数字为：" + sj);
    }

    public static boolean check(String str){
        if (str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('0' > c || '9' < c){
                return false;
            }
        }
        return true;
    }

    public static String checkLuoMa(char number){
        String str = switch (number){
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return str;
    }
}
