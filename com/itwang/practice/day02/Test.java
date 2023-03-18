package com.itwang.practice.day02;

public class Test {
    public static void main(String[] args){
        int hMoney = 21;
        int lMoney = 24;
        int count = 0;

        for (int i =0;i < 100 ;i++) {
            hMoney = (2*hMoney) + 3;
            lMoney = 2*lMoney;
//            String flag = (hMoney == lMoney) ? "对" : "不对";
//            System.out.println(flag);
            if (hMoney == lMoney){
                System.out.println(hMoney);
                System.out.println(lMoney);
                System.out.println("经过"+ count++ + "次，对" );
            }
            else {
                System.out.println(hMoney);
                System.out.println(lMoney);
                System.out.println("经过" + count++ + "次 不对");
            }
        }

    }
}
