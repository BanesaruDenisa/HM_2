package com.company;

public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void printCircle(){
        circle.print();
    }
    public void printRectangle(){
        rectangle.print();
    }
    public void printSquare(){
        square.print();
    }
}
