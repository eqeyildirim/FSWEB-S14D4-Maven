package org.example.model;

public class Coke extends ProductForSale {

    public Coke(String type, int price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Ürün tipi: " + getType() +" |"+
                " Ürün fiyatı: " + getPrice() +" |"+
                " Ürün açıklaması: " + getDescription() );
    }
    }

