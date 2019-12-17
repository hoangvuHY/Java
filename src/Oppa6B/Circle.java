package Oppa6B;
public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2.0 * Math.PI * this.radius;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            if (this.getRadius() == other.getRadius() && this.getCenter().equals(other.getCenter())) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    //"Circle[center=(10.0,5.0),radius=8.0,color=RED,filled=true]"
    public String toString() {
        return "Circle[center=(" + this.center.getX() + "," + this.center.getY()
                + "),radius=" + this.radius + ",color=" + super.getColor()
                +",filled=" + super.isFilled() +"]";
    }

    public static void main(String[] args) {

    }
}
