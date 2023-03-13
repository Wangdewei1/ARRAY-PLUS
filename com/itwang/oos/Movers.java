package com.itwang.oos;

public class Movers {
    private int id;
    private String name;
    private double price;
    private double score;
    private String zActor;
    private String dActor;
    private String others;

    public Movers() {
    }

    public Movers(int id, String name, double price, double score, String zActor, String dActor, String others) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.zActor = zActor;
        this.dActor = dActor;
        this.others = others;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getzActor() {
        return zActor;
    }

    public void setzActor(String zActor) {
        this.zActor = zActor;
    }

    public String getdActor() {
        return dActor;
    }

    public void setdActor(String dActor) {
        this.dActor = dActor;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
