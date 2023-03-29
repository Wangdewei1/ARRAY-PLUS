package com.itwang.sgg;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-------------判断一个人的年龄--------------");
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println(ifAge(age));
        }
    }
    public static String ifAge(int age){
        if(age > 0 && age < 6){
            return "儿童";
        }
        if(age >= 6 && age <= 13){
            return "少儿";
        }
        if(age >= 14 && age <= 17){
            return "青少年";
        }
        if(age >= 18 && age <= 35){
            return "青年";
        }
        if(age >= 36 && age <= 50){
            return "中年";
        }
        if(age > 50){
            return "老年";
        }
        return null;
    }
}
