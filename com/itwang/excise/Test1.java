package com.itwang.excise;

import java.util.Random;

/**
 *验证码案例
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(code(6));
    }

    public static String code(int num){
        Random r = new Random();
        String ch = "";
        for (int i = 1; i <= num; i++) {
            int number = r.nextInt(3);
            switch (number){
                //0-9随机数字
                case 0:
                    int n = r.nextInt(10);
                    ch += n;
                    break;
                //大写的英文字母
                case 1:
                    char c = (char) (r.nextInt(10) + 65);
                    ch += c;
                    break;
                case 2:
                    char c1 =  (char)(r.nextInt(10) + 98);
                    ch += c1;
                    break;
            }
        }
        return ch;
    }
}
