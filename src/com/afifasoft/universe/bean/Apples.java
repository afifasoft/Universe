package com.afifasoft.universe.bean;

public class Apples {

    public int id;
    public String name;

    public int numApples;

    public Brand brand;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumApples() {
        return numApples;
    }

    public void setNumApples(int numApples) {
        this.numApples = numApples;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    public Apples getApples(int x) {
        Apples apples = new Apples();
        return  apples;
    }
}
