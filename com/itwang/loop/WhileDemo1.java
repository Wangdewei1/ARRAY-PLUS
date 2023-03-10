package com.itwang.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
        double paperHeight = 0.1;
        double peakHeight = 8848860;
        int count = 0;
        while (paperHeight < peakHeight){
            paperHeight *= 2.00;
//            paperHeight = paperHeight*2;
            count++;
        }
        System.out.println(count);
    }
}
