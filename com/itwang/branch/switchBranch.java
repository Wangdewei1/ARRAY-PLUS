package com.itwang.branch;

import java.util.Date;

public class switchBranch {
    public static void main(String[] args) {
        int week = 1;
        switch (week){
            case 1:
                System.out.println("埋头苦干解决bug");
                break;
            case 2 :
                System.out.println("请求大牛程序员帮忙");
                break;
            case 3:
                System.out.println("今晚啤酒龙虾小烧烤");
                break;
            case 4:
                System.out.println("主动帮忙新来的女程序员");
                break;
            case 5:
                System.out.println("今晚吃鸡");
                break;
            case 6:
                System.out.println("与王珀介绍的校小芳相亲");
                break;
            case 7:
                System.out.println("郁郁寡欢准备上班");
                System.out.println("123");
                break;
            default:
                System.out.println("系统出错，请联系管理员");
        }

    }
}
