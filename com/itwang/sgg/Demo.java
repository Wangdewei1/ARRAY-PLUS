package com.itwang.sgg;

public class Demo {
    public static void main(String[] args) {
        //前两行的打印
        System.out.println("      *                   *     ");
        System.out.println("   *      * I Love Java *      *");
       printStar(6);
    }

    public static void printStar(int row){
        /**
         *         *********   
         *           *****
         *             *
         */

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < 2 * i + 5; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (row - i) * 4 + 1; k++) {
                if (k == 0 || k == (row - i) * 4 ){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
