package com.itwang.arrayList.arrayList1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("投币");
        list.add("注销");
        list.add("登入");
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj);
    }
}
