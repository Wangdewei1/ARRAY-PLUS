package com.itwang.springbuilder;

public class SpringBuilderDemo1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        System.out.println(method(arr));
    }
    public static String method(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){

                sb.append(arr[i]);
            }else {
                sb.append(arr[i]+" ,");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
