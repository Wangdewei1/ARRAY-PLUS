package com.itwang.arrayList.arrayList1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cde");
        list.add("efg");
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj);
    }
}
