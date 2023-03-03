package oop.parcial2.shapes;

public class Circle extends Shape{

    private double radius;

    //circle is defined as having one side, however they really don't have any
    public Circle() {
        super("Circle ◯", 1);
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

}