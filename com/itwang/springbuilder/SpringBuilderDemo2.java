package com.itwang.springbuilder;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 罗马数字 转换
 */
public class SpringBuilderDemo2 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请您输入一组字符串：");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag){
                break;
            }else {
                System.out.println("请输入的字符串不符合规则，请重新输入：");
                continue;
            }
        }

//        StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner(" ","","");
        System.out.print("转换为罗马数字：");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sj.add(checkLuoMa((c - 48)));
        }
        System.out.print(sj);
    }
    public static boolean checkStr(String str){

        if (str.length() > 9 ){
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
    public static String checkLuoMa(int number){
        String[] strings = {"", "Ⅰ" , "Ⅱ", "Ⅲ" , "Ⅳ", "Ⅴ" , "Ⅵ", "Ⅶ" , "Ⅷ" , "Ⅸ" };
        return strings[number];
    }

}
