package com.itwang.recursion;
/**
 * 把1、2题用while循环或do...while循环改写？
 * 1.(for循环) 1+2+3+...+100 ?
 * 2.(for循环) 1 + 3 + 5+...+99的和？
 */
public class TestDoWhileLoop {
    public static void main(String[] args) {
        //1.方法一
        System.out.print("方法一： ");
        whileMethod();
        //2.方法二
        System.out.print("方法二： ");
        doWhileMethod();
    }

    /**
     * 1.(for循环) 1+2+3+...+100 ?
     */
    public static void whileMethod(){
        //定义2个变量
        int num = 1;
        int count = 0;
        //打印1 - 100的每个数
        while(num <= 100){
            //将 1 - 100 逐个相加
            count = count + num;
            num++;
        }
        int result = count;
        System.out.println("1 + 2 + 3 +...+ 100 = " + result);
    }

    /**
     *  2.(for循环) 1 + 3 + 5+...+99的和？
     */
    public static void doWhileMethod(){
        //定义2个变量
        int num = 1;
        int count = 0;
        do {
            count += 2 * num - 1;
            num++;
        }while (num <= 50);
        int result = count;
        System.out.println("1 + 3 + 5+...+99 = " + result);
    }
}
