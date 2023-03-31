package com.itwang.recursion;

public class Ban {
    public static void main(String[] args) {
        //全男人搬最多
        int manCount = 9;
        //女人搬最多
        int womanCount = 12;
        //总数
        int count = 36;
        for (int i = 0; i < womanCount; i++) {
            for (int j = 0; j < manCount; j++) {
                int children = count - i -j;
                if ( 2 * i + 4 * j + children / 2 == 36 && children % 2 == 0){
                    System.out.print("女人：" + i + "人");
                    System.out.print(" 男人：" + j + "人");
                    System.out.print(" 小孩：" + children + "人");
                    System.out.println();
                }
            }
        }
    }
}
