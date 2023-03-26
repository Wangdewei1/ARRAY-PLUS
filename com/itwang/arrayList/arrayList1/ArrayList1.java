package com.itwang.arrayList.arrayList1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        list.set(0,"eee");
        System.out.println(list);
    }
}
