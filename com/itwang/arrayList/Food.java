package com.itwang.arrayList;

public class Food {
    private int id;
    private String name;
    private double qPrice;
    private double hPrice;
    private String desc;

    public Food() {
    }

    public Food(int id, String name, double qPrice, double hPrice, String desc) {
        this.id = id;
        this.name = name;
        this.qPrice = qPrice;
        this.hPrice = hPrice;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getqPrice() {
        return qPrice;
    }

    public void setqPrice(double qPrice) {
        this.qPrice = qPrice;
    }

    public double gethPrice() {
        return hPrice;
    }

    public void sethPrice(double hPrice) {
        this.hPrice = hPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
