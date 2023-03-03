package oop.parcial2.shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle() {
        super("Rectangle ▭", 4);
    }

    public Rectangle(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return height * 2 + width * 2;
    }

}
