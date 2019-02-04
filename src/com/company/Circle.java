package com.company;

public class Circle extends Shape {

    public double radius;
    public double perimeter;
    public double area;


    @Override
    public void printShape(){
        System.out.println("The circle's color is:  " + this.getColor() +
                "\nThe circle's 'filled' is:  " + this.isFilled() +
                "\nThe circle's perimeter is:  " + this.getPerimeter(this.getRadius()) +
                "\nThe circle's area is:  " + getArea(this.getRadius()));
    }

    public double getPerimeter(double radius){
        this.perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getArea (double radius){
        this.area = Math.PI * (radius * radius);
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
