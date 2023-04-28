package com.tasks.springhw;

public class ItemProduct {
    private int id;
    private String product;

    public ItemProduct() {
    }

    public ItemProduct(int id, String product) {
        this.id = id;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ItemProduct{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }
}
