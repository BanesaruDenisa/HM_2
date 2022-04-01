package com.company;

public class Main {
    public static void main(String[] args) {

        ProductFactory productF = new ProductFactory();
        Product prod = productF.createProduct("New");
        prod.print();

    }
}
