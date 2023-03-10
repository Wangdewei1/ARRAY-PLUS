package com.itwang.loop;

public class ForDemo1 {
    public static void main(String[] args) {
//        for (int i = 0;i < 3;i++){
//            System.out.println("123");
//        }

        {
            int i = 0;
            if (i < 3) {
                i++;
                System.out.println("123");
            }
        }

        int i = 0;
        if (i<3){++i;}
        int a = i++;
        System.out.println(a);

    }
}
