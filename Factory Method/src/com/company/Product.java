package com.company;

public interface Product {

    default void print(){
        System.out.println("This is a Product.");
    }

}
