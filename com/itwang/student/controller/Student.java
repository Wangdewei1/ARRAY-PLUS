package com.itwang.student.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        System.out.println("-------------学生管理系统-------------");
        System.out.println("1:添加学生");
        System.out.println("2:修改学生");
        System.out.println("3:查询学生");
        System.out.println("4:删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择您的操作：");
        int number = sc.nextInt();
        System.out.println(choose(number));
    }
    public static String choose(int number){
        switch (number){
            case 1:
                add();
                return "----添加成功----";
            case 2:
                return "1";
            case 3:
                return "2";
            case 4:
                return "3";
            default:
                return "4";
        }
    }
    public static void add(){
    ArrayList<com.itwang.student.bean.Student> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
        System.out.println("请输入添加学生的id：");
        int id = sc.nextInt();
        System.out.println("请输入添加学生的姓名：");
        String name = sc.next();
        System.out.println("请输入添加学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入添加学生的地址：");
        String address = sc.next();
        com.itwang.student.bean.Student student = new com.itwang.student.bean.Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        list.add(student);
    }
    public static ArrayList<com.itwang.student.bean.Student> updateStudent(int id) {
        return null;
    }
}
