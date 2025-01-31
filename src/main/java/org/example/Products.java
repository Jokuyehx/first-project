package org.example;

public class Products {
    private String name;
    private double price;
    private int count;

    public int getCount() {
        return count;
    }

    public void addCount(int newCount) {
        count += newCount;
    }

    public boolean removeCount(int removeCount) {
        if (count < removeCount) return false;

        count -= removeCount;
        return true;
    }

    public Products(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;

    }

    public double getPrice() {
        return price;
    }

}