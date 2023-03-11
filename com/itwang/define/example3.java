package com.itwang.define;

/**
 * test
 */
public class example3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        characterNum(arr1,arr2);
    }
    public static void characterNum(int[] arr1,int[] arr2){
        if (arr1.equals(null) && arr2.equals(null)){
            System.out.println("null");
            return;
        }
        if (arr1.equals(arr2)){
            System.out.println("这两个数组一莫一样");
        }
    }
}
