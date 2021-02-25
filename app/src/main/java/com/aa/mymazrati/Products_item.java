package com.aa.mymazrati;

public class Products_item {

    private String titlt;
    private int product_photo;

    public Products_item(Products_item fName) {
    }

    public Products_item(String titlt, int product_photo) {
        this.titlt = titlt;
        this.product_photo = product_photo;
    }

    public String getTitlt() {
        return titlt;
    }

    public void setTitlt(String titlt) {
        this.titlt = titlt;
    }

    public int getProduct_photo() {
        return product_photo;
    }

    public void setProduct_photo(int product_photo) {
        this.product_photo = product_photo;
    }
}
