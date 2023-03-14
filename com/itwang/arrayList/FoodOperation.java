package com.itwang.arrayList;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 食品操作类
 */
public class FoodOperation {
    private ArrayList<Food> foods = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    //添加菜品
    public void add(){
        System.out.println("===========添加菜品==============");
        Food food = new Food();

            System.out.println("请您输入要上架的商品id: ");
            int id = sc.nextInt();
            food.setId(id);

            System.out.println("请您输入要上架的商品名称: ");
            String name = sc.next();
            food.setName(name);

            System.out.println("请您输入要上架的商品优惠前价格: ");
            double qPrice = sc.nextDouble();
            food.setqPrice(qPrice);

            System.out.println("请您输入要上架的商品优惠后的价格: ");
            double hPrice = sc.nextDouble();
            food.sethPrice(hPrice);

            System.out.println("请您输入要上架的商品详细信息: ");
            String desc = sc.next();
            food.setDesc(desc);

            foods.add(food);
            System.out.println("恭喜您上架成功···");
    }

    //浏览商品信息
    public void getProduct(){
        System.out.println("--------菜品信息-----------");
        for (int i = 0; i < foods.size(); i++) {
            Food food = foods.get(i);
            System.out.println("商品id：" + food.getId());
            System.out.println("商品名称：" + food.getName());
            System.out.println("商品优惠前价格：" + food.getqPrice());
            System.out.println("商品优惠后价格：" + food.gethPrice());
            System.out.println("商品其他信息：" + food.getDesc());
            System.out.println("------------");
        }
    }

    public void start(){
        while (true) {
            System.out.println("==========点餐系统============");
            System.out.println("请您输入操作：");
            System.out.println("1.输入query 查询商品信息"+" 2.输入add 添加商品信息"+" 3.输入exit 退出系统");
            String print = sc.next();
            switch (print){
                case "query":
                    getProduct();
                    break;
                case "add":
                    add();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("操作有误，请重新操作~~");
            }
        }
    }
}
