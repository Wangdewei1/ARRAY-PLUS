package com.itwang.define;

/**
 * 数组反转问题
 */
public class Arraydiffer {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {11,22,33,44,55};
        //2.定义连个变量 i，j
        int i = 0;
        int j = arr.length-1;
//        System.out.println(i);
//        System.out.println(arr[arr.length - 1]);
        //3.反转数组
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("{");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.print("}");
    }
}
