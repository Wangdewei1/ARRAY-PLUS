package com.itwang.arrayList.arrayList1;

import com.itwang.bean.Student;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("王梓伟",11));
        studentArrayList.add(new Student("李书城",17));
        studentArrayList.add(new Student("小红书",21));

        StringBuilder sb = new StringBuilder();
        System.out.print("[");
        for (int i = 0; i < studentArrayList.size(); i++) {
                sb.append(studentArrayList.get(i).getName());
                sb.append(",");
                sb.append(studentArrayList.get(i).getAge()+"][");
        }
        System.out.print(sb+"]");
        System.out.println("[姓名,年龄] ");
    }
}
