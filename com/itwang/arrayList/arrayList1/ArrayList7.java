package com.itwang.arrayList.arrayList1;

import com.itwang.bean.Phone;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("小米",1000));
        list.add(new Phone("苹果",8000));
        list.add(new Phone("锤子",2999));
        ArrayList<Phone> phones = listPhone(list);
        for (int i = 0; i < list.size(); i++) {
            Phone phone = phones.get(i);
            System.out.println("品牌：" + phone.getName() + " 价格：" + phone.getPrice());
        }
    }
    public static ArrayList<Phone> listPhone( ArrayList<Phone> phones){
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            Phone phone = phones.get(i);
            double price = phone.getPrice();
            if ( price < 3000){
                resultList.add(phones.get(i));
            }
        }
        return phones;
    }
}
