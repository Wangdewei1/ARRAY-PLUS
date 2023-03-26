package com.itwang.arrayList.arrayList1;

import com.itwang.bean.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1,"zhangsan","123456"));
        list.add(new User(2,"lisi","123456"));
        list.add(new User(3,"wangwu","123456"));
        System.out.println(getUserById(4,list));
    }
    public static boolean getUserById(int id,ArrayList<User> users){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
}
