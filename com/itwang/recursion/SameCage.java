package com.itwang.recursion;

/**
 * （for循环）百钱买百鸡 ；3文钱能买1只公鸡，
 * 2文钱可以买一只母鸡，1文钱可以买3只小鸡。
 * 用100文钱买100只鸡，那么各有公鸡，母鸡，小鸡各多少？
 */
public class SameCage {
    public static void main(String[] args) {
        //总数
        int count = 100;
        //公鸡最多33只
        int cockCount = 33;
        //母鸡最多50只
        int henCount = 50;
        for (int i = 0; i < cockCount; i++) {
            for (int j = 0; j < henCount; j++) {
                //小鸡数量
                int smallChickCount = count-i-j;
                if (3 * i + 2 * j + smallChickCount / 3 == 100 && smallChickCount % 3 == 0){
                    System.out.print("公鸡：" + i + "只");
                    System.out.print(" 母鸡：" + j + "只");
                    System.out.print(" 小鸡：" + smallChickCount + "只");
                    System.out.println();
                }
            }
        }
    }
//    public static void sameCage(){
//        int money = 100;
//        int count = 100;
//        // cock(公鸡)
//        int cockCount = 0;
//        // hen(母鸡)
//        int henCount = 0;
//        int smallChickCount = 0;
//        for (int i = 1; i <= count; i++) {
//            //购买一只公鸡的钱
//            if (cockCount >= 1){
//                money -= 3 * cockCount;
//                count -= cockCount;
//                cockCount++;
//            }
//            //购买一只母鸡
//            if (henCount >= 1){
//                money -= 2 * henCount;
//                count -= henCount;
//                henCount++;
//            }
//            //购买三只小鸡
//            if(smallChickCount >= 3 * i){
//                money -= 1;
//                count -= smallChickCount;
//                smallChickCount++;
//            }
//        }
//    }
}
