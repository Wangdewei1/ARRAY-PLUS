package com.itwang.practice.day02;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8
 * 折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==============点菜系统================");
            System.out.println("欢迎光临本店"+"\n"+"菜单：");
            System.out.println("鱼香肉丝 24元 油炸花生米 8元 米饭 3元"+"\n"+"  ");
            System.out.println("1.套餐一 鱼香肉丝16元 + 花生米 8元 + 米饭 3元"+"\n"
                             + "2.套餐二 鱼香肉丝24元 + 花生米 8元 + 米饭 3元订单满30元8八折优惠"
                              );

            int num = sc.nextInt();
            int yuPrice = 24;
            int huaPrice = 8;
            int miPrice = 3;
            double money = yuPrice + huaPrice + miPrice;
            switch (num){
                case 1:
                    if (money >= 30){
                        money =  (0.8*(yuPrice + huaPrice + miPrice));
                        System.out.println("一共消费：" + money);
                        break;
                    }
                case 2:
                    money = yuPrice-8 +huaPrice + miPrice;
                    System.out.println("一共消费：" + money);
                    break;
            }
            double money1 = (0.8*(yuPrice + huaPrice + miPrice));
            double money2 = yuPrice-8 +huaPrice + miPrice;
            System.out.println("最少花销为： " + (money1 > money2 ? money2 : money1));
            System.out.println("推荐套餐二哦");
        }
    }
}
