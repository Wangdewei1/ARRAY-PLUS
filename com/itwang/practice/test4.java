package com.itwang.practice;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = 0;
        int count = 0;
        while(true){
            System.out.println("您为大人还是小孩？请输入命令 大人 或 小孩");
            String people = sc.next();
            if(people.equals("大人")){
                money += 2;
                count++;
            }else if(people.equals("小孩")){
                money += 1;
                count++;
            }else{
                System.out.println("您输入有误，请如输入 “大人” 或 “小孩 ”");
            }
            System.out.println("一共上来:" + count + "人 " + "总金额:" + money);
        }

    }
}
