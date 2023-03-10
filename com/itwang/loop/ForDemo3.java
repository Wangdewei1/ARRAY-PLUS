package com.itwang.loop;

/**
 * //数据求和
 */
public class ForDemo3 {
    public static void main(String[] args) {
        //2.定义一个装水的杯子  也就是定义求和的变量sum
        int sum = 0;
        //1.获取从1-5的数据
        for (int i = 1; i <=100 ; i++) {
            sum += i;
        }
        System.out.println("结果为：" + sum);
    }
}
