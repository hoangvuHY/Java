package Oppa5;

import java.util.PrimitiveIterator;

public class Circle {

    protected final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double res = PI * this.radius * this.radius;
        return res;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + ",color=" + this.color + "]";
    }

    public static void main(String[] args) {

    }
}
