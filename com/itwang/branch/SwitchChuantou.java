package com.itwang.branch;

public class SwitchChuantou {
    public static void main(String[] args) {
        int week = 2;
        switch (week) {
            case 1:
                System.out.println("埋头苦干解决bug");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("主动帮忙新来的女程序员");
                break;
            case 5:
                System.out.println("今晚吃鸡");
                break;
            case 6:
            case 7:
                System.out.println("郁郁寡欢准备上班");
                System.out.println("123");
                break;
            default:
                System.out.println("系统出错，请联系管理员");
                System.out.println("222");
        }
    }
}
