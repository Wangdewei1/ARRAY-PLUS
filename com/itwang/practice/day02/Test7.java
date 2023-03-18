package com.itwang.practice.day02;

import java.util.Scanner;

/**
 * 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8
 * 折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
 */
public class Test7 {
    public static void main(String[] args) {

    }
    public static void method(){
        System.out.println("==============点菜系统================");
        System.out.println("欢迎光临本店"+"\n"+"菜单：");
        System.out.print("1.鱼香肉丝 2.油炸花生米 3.米饭");
        int yuPrice = 24;
        int huaPrice = 8;
        int miPrice = 3;
        int money = yuPrice+huaPrice+miPrice;
        System.out.println("单点菜价不享受优惠  订单满30元8八折优惠");
        if (money >= 30){
            money *= 0.8;
            System.out.println("订单满30元8八折优惠后价格："+money);
        }else {
            yuPrice = 16;
            money = yuPrice + huaPrice + miPrice;
            System.out.println("鱼香肉丝优惠后的价格+花生米价格+米饭价格为："+money);
        }

    }
}
