package O6ppa;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double res = this.radius * this.radius * Math.PI;
        return res;
    }

    @Override
    public double getPerimeter() {
        double res = 2.0 * this.radius * Math.PI;
        return res;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + this.radius +
                ",color=" + super.getColor() +
                ",filled=" + super.isFilled() + "]";
    }

    public static void main(String[] args) {

    }
}
