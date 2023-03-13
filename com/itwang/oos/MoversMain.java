package com.itwang.oos;

import java.util.Scanner;

public class MoversMain {
    public static void main(String[] args) {
        Movers[] movers = new Movers[4];
        movers[0]  = new Movers(1,"战狼2",30.2,92,"吴京","无名氏","123");
        movers[1] = new Movers(2,"肖生客的救赎",50.2,93,"詹姆斯","无名氏","345");
        movers[2] = new Movers(3,"流浪地球",34.9,80,"吴京","无名氏","456");
        movers[3] = new Movers(4,"西红柿首富",59.0,99,"沈腾","无名氏","678");

        MoversOperation moversOperation = new MoversOperation(movers);
        moversOperation.printAllMovers();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您想要看的电影编号：");
            int number = sc.nextInt();
            for (int i = 0; i < movers.length; i++) {
                if (movers[i].getId() == number) {
                    moversOperation.SearchMover(number);
                    break;
                }
            }
            System.out.println("没有该电影信息");
        }
    }
}
