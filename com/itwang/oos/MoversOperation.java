package com.itwang.oos;

import java.util.Scanner;

public class MoversOperation {
    private Movers[] movers;

    public MoversOperation() {
    }

    public MoversOperation(Movers[] movers) {
        this.movers = movers;
    }

    public void printAllMovers(){
        System.out.println("-----展示电影的全部信息-----");
        for (int i = 0; i < movers.length; i++) {
            Movers m= movers[i];
            System.out.println("编号:"+m.getId());
            System.out.println("电影名称:"+m.getName());
            System.out.println("价格:"+m.getPrice());
            System.out.println("分数:"+m.getScore());
            System.out.println("----------------");
        }

    }
    public void SearchMover(int id){
        System.out.println("-----根据id搜索电影-------");

        for (int i = 0; i < movers.length; i++) {
            Movers m = movers[i];
            if (m.getId() == id){
                System.out.println("编号:"+m.getId());
                System.out.println("电影名称:"+m.getName());
                System.out.println("价格:"+m.getPrice());
                System.out.println("分数:"+m.getScore());
                System.out.println("主演:"+m.getzActor());
                System.out.println("导演:"+m.getdActor());
                System.out.println("其他信息下:"+m.getOthers());
                System.out.println("----------");
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
