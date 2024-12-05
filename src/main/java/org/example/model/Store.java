package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products=new ProductForSale[]{
            new Chocolate("Bitter Çikolata",50,"açıklaması"),
            new Coke("Sarıyer",100,"Yerli üretim"),
                new Bread("Tam Buğday Ekmeği", 10, "Sağlıklı tam buğday ekmeği")
        };
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products){
            product.showDetails();
        }

    }
}