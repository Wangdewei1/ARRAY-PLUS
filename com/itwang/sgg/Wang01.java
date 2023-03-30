package com.itwang.sgg;

import java.util.Scanner;
public class Wang01 {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("计算 n 天还有多少个星期多少天，请输入“ 1 ”");
            System.out.println("想进行华氏度与摄氏度的转换，请输入“ 2 ”");
            System.out.println("想查询一个数的个十百位，请输入“ 3 ”");
            System.out.println("想查询某个年份是否是闰年，请输入“ 4 ”");
            System.out.println("想知道五福娃的名字，请输入“ 5 ”");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    wgeg();
                    break;
                case 2:
                    weekConversion();
                    break;
                case 3:
                    wenduConversion();
                    break;
                case 4:
                    yearInquire();
                    break;
                case 5:
                    numberConversion();
                    break;
                case 6:
                    beijingInquire();
                    break;
                default:
                    System.out.println("输入错误，没有这个指令");
            }

        }

        // while(true){
        // 	Scanner myScanner = new Scanner(System.in);


        // 	System.ouot.println("计算 n 天还有多少个星期多少天，请输入“ 1 ”");
        // 	System.ouot.println("想进行华氏度与摄氏度的转换，请输入“ 2 ”");
        // 	System.ouot.println("想查询一个数的个十百位，请输入“ 3 ”");
        // 	System.ouot.println("想查询某个年份是否是闰年，请输入“ 4 ”");
        // 	System.ouot.println("想知道五福娃的名字，请输入“ 5 ”");


        // 	int ti = myScanner.nextInt();


        // 	//用if语句选择调用哪个方法
        // 	if(ti == 1){
        // 		weekConversion();
        // 	}else if(ti == 2){
        // 		wenduConversion();
        // 	}else if(ti == 3){
        // 		numberConversion();
        // 	}else if(ti == 4){
        // 		yearInquire();
        // 	}else if(ti == 5){
        // 		beijingInquire();
        // 	}


        // 	//打印提示是否继续
        // 	System.out.println("是否继续查询，查询请输入 1");

        // 	int n1 = myScanner.nextInt();

        // 	if(n1 != 1){
        // 		break;
        // 	}

        // }

    }


    public static void wgeg() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);


            System.out.println("计算 n 天还有多少个星期多少天，请输入“ 1 ”");
            System.out.println("想进行华氏度与摄氏度的转换，请输入“ 2 ”");
            System.out.println("想查询一个数的个十百位，请输入“ 3 ”");
            System.out.println("想查询某个年份是否是闰年，请输入“ 4 ”");
            System.out.println("想知道五福娃的名字，请输入“ 5 ”");


            int ti = myScanner.nextInt();


            //用if语句选择调用哪个方法
            if (ti == 1) {
                weekConversion();
            } else if (ti == 2) {
                wenduConversion();
            } else if (ti == 3) {
                numberConversion();
            } else if (ti == 4) {
                yearInquire();
            } else if (ti == 5) {
                beijingInquire();
            }


            //打印提示是否继续
            System.out.println("是否继续查询，查询请输入 1");

            int n1 = myScanner.nextInt();

            if (n1 != 1) {
                break;
            }

        }

    }


    // 查询这天还有几个星期几天
    public static void weekConversion() {

        Scanner myScanner = new Scanner(System.in); // 创建Scanner对象

        System.out.println("请输入你要计算的天数");

        int day1 = myScanner.nextInt();

        int day = day1;

        int a1 = day / 7;
        int b = day % 7;
        System.out.println(day + "天有" + a1 + "个星期" + b + "天");
    }


    // 华氏度和摄氏度的转换

    public static void wenduConversion() {
        //创建Scanner
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入你要转换的华氏度");

        Double huashidu = myScanner.nextDouble();

        double c = huashidu;
        double d = 5 / 9.0 * (c - 100);

        System.out.println(c + "华氏度对应的摄氏度为" + d);
    }


    //查询某年是不是闰年
    public static void yearInquire() {

        Scanner sc = new Scanner(System.in); // 键盘输入年份

        System.out.println("输入年份");
        int w = sc.nextInt();

        if (w % 4 == 0 && w % 100 != 0) {
            System.out.println(w + "是闰年");
        } else if (w % 100 == 0 && w % 400 == 0) {
            System.out.println(w + "是闰年");
        } else {
            System.out.println(w + "不是闰年");
        }
    }


    //查询一个整数的个十百位
    public static void numberConversion() {

        //这段代码否正确？
        //如果正确，假设 price 为100，那计算之后的realPrice的值为多少？
        //如果不正确，应该怎么改正？
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你要查看的数");
        int a1 = myScanner.nextInt();
        int n = a1;

        int a = n % 10; // 个位
        int b = n / 10 % 10; //十位
        int c = n / 100; // 百位

        System.out.println("n的个位：" + a);

        System.out.println("n的十位：" + b);

        System.out.println("n的百位：" + c);
    }


    //输入一个整数让北京欢迎你
    public static void beijingInquire() {
        while (true) {
            Scanner myScanner = new Scanner(System.in);

            System.out.println("输入一个整数"); // 打印提示输入

            int a = myScanner.nextInt();

            switch (a) {
                case 1:
                    System.out.println("贝贝");
                    break;
                case 2:
                    System.out.println("晶晶");
                    break;
                case 3:
                    System.out.println("欢欢");
                    break;
                case 4:
                    System.out.println("迎迎");
                    break;
                case 5:
                    System.out.println("妮妮");
                    break;
                default:
                    System.out.println("北京欢迎你");
                    break;
            }
            System.out.println("退出程序请按 “ 0 ”，按任意键继续");

            int i = myScanner.nextInt();
            if (i == 0) {
                break;
            }

        }
    }
}