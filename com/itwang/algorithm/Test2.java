package com.itwang.algorithm;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        bubbleSort();
    }
    public static void bubbleSort(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int temp;
        System.out.println("排序前的数组： ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int nums = arr[i];
            if (i < arr.length-1){

                System.out.print( nums + ",");
            }else {
                System.out.print( nums );
            }
        }
        System.out.println("]");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("排序后的数组： ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int nums = arr[i];
            if (i != arr.length-1){

                System.out.print( nums + ",");
            }else {
                System.out.print( nums );
            }
        }
        System.out.println("]");

    }
}
