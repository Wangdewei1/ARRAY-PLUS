package com.itwang.arrayList.arrayList1;

import com.itwang.bean.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.print("请输入姓名：");
                String name = sc.next();
                System.out.print("请输入年龄：");
                int age = sc.nextInt();
                Student student = new Student();
                student.setName(name);
                student.setAge(age);
                list.add(student);
            }
        for (int i = 0; i < list.size(); i++) {
            String name1 = list.get(i).getName();
            int age1 = list.get(i).getAge();
            System.out.println("姓名："+name1+" 年龄："+age1);
        }
    }
}
