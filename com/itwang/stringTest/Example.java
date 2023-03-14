package com.itwang.stringTest;

import java.util.Scanner;

/**
 * z字符串案例 登入功能
 *
 *
 */
public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名:");
            String name = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            UserOperation userOperation = new UserOperation();
            boolean login = userOperation.login(name, password);
            if (login){
                System.out.println("欢迎"+name+"登入");
                break;
            }
        }
    }
}
