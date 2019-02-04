package com.company;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
