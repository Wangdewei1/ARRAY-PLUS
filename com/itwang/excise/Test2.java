package com.itwang.excise;

/**
 * 飞机票
 */
public class Test2 {
    public static void main(String[] args) {

        System.out.println(calculate(1000,2,10));
    }
    public static double calculate(double prices,int type,int month){
        if (type == 1){
            switch (month){
                case 1:
                case 2:
                case 3:
                case 4:
                case 11:
                case 12:
                    prices = prices * 0.7;
                    return prices;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    prices = prices*0.9;
                    return prices;
            }
        }
         if (type == 2){
             switch (month){
                 case 1:
                 case 2:
                 case 3:
                 case 4:
                 case 11:
                 case 12:
                     prices = prices*0.65;
                     return prices;
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                 case 10:
                     prices = prices*0.85;
                     return prices;
             }
         }
         return prices;
    }
}
