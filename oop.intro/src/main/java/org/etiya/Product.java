package org.etiya;

public class Product {
    private int id;
    private String name;
    private double price;
    private int discountRate;
    private double discountedPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    // değer atamak set
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountedPrice() {
        discountedPrice = price * (100 - discountRate);
        return discountedPrice;
    }


}
