package com.itwang.arrayList;

import java.util.ArrayList;

/**
 * 删除购物车 带有枸杞字样的商品
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> productByCar = new ArrayList<>();
        productByCar.add("枸杞");
        productByCar.add("黑枸杞");
        productByCar.add("枸杞子");
        productByCar.add("六桂福珠宝戒指");
        productByCar.add("白莲子");
        productByCar.add("枸杞粥");

        //方法一
        for (int i = 0; i < productByCar.size(); i++) {
            String product = productByCar.get(i);
            if (product.contains("枸杞")){
                productByCar.remove(product);
                i--;
            }
        }
        System.out.println(productByCar);

        //方法二
        for (int j = productByCar.size() - 1; j >= 0; j--) {
            String product = productByCar.get(j);
            if (product.contains("枸杞")){
                productByCar.remove(product);
            }
        }
        System.out.println(productByCar);
    }

}
