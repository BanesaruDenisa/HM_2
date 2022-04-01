package com.company;

public interface Shape {
    default void print(){
        System.out.println("This is a shape");
    }
}
