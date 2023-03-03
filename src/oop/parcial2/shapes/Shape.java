package oop.parcial2.shapes;

public abstract class Shape {

    private String name;
    private int sides;

    public Shape(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getName(){
        return name;
    }

    public int getSidesCount(){
        return sides;
    }

}
