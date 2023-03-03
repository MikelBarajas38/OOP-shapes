package oop.parcial2.shapes;

public class Triangle extends Shape{

    private double height;
    private double base;

    public Triangle() {
        super("Triangle △", 3);
    }

    public Triangle(double base, double height) {
        this();
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return height * base / 2;
    }

    //assuming triangle is equilateral
    public double getPerimeter() {
        return base * 3; //assuming equilateral
    }

}