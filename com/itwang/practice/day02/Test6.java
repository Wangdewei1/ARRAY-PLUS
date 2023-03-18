package com.itwang.practice.day02;

import java.util.Scanner;

/**
 * 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
 * <p>
 * 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
 * <p>
 * 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
 * <p>
 * 现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println("=========身高系统==========");
        Scanner sc = new Scanner(System.in);


        //如果是 0 则代表默认求儿子身高  1 则代表求女儿身高
        while (true) {
            System.out.print("父亲身高为：");
            double fatherHeight = sc.nextDouble();
            System.out.print("母亲身高为：");
            double matherHeight = sc.nextDouble();
            System.out.println("请您输入要求谁的身高？\n 0：求儿子的身高 \n 1：求女儿身高");
            int num = sc.nextInt();
            if (num == 0 || num == 1) {

                switch (num) {
                    case 0:
                        System.out.println("儿子身高为：" + (int)((fatherHeight + matherHeight) * 1.08 / 2) + "厘米");
                        break;
                    case 1:
                        System.out.println("女儿身高为：" + (int)(((fatherHeight * 0.923) + matherHeight) / 2) + "厘米");
                        break;
                }
                System.out.println("-------------------------------");
            }
        }
    }
}
