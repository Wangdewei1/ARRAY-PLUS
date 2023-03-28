package com.itwang.sgg;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("  *                 *  ");
        System.out.println("*   * I Love Java *   *");
        int count1 = 3;
        int count2 = 21;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 23 ; j++) {
                if (j != count1 || j != count2){
                    System.out.print(" ");
                    count1++;
                }
            }
            for (int k = 1; k <= 23; k++) {
                System.out.print("*");
                count2--;
            }
            System.out.println();
        }
/*        for (int i = 1; i <= 23; i++) {
            System.out.println();
        }*/
    }
}
