package com.company;

public class Main {

    public static void main(String[] args) {
        Shape myShape = new Shape("Blue",false);

        myShape.printShape();

        Circle myCircle = new Circle(4, "Red", true);

        myCircle.printShape();
    }
}
