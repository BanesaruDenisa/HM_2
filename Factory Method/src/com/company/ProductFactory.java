package com.company;

public class ProductFactory {

    public Product createProduct(String type) {

        if(type == null){
            return null;
        }
        switch(type){
            case "New" :
                return new NewProduct();
            case "Disc" :
                return new DiscountedProduct();
            case "Bio" :
                return new BioProduct();
            default:
                throw new IllegalArgumentException("Unknown type");
        }

    }
}
