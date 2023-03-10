package com.itwang.loop;

/**
 * 求100内的奇数和
 */
public class ForDemo4 {
    public static void main(String[] args) {
        //2.定义sum
        int sum = 0;
        //1.定义每个奇数数据
        for (int i =1;i<=100;i+=2){
//            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);

    }
}
