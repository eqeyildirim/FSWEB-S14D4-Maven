package org.example.model;

public class Bread extends ProductForSale {


    public Bread(String type, int price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Ürün tipi: " + getType() +
                " Ürün fiyatı: " + getPrice() +
                " Ürün açıklaması: " + getDescription());
    }
}