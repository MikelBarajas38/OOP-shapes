package oop.parcial2.shapes;

public class Square extends Shape{

    private double side;

    public Square() {
        super("Square □", 4);
    }

    public Square(double side) {
        this();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

}

