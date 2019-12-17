package O6ppa;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
    }
    @Override
    public double getArea() {
        double res = this.width * this.length;
        return res;
    }
    @Override
    public double getPerimeter() {
        double res = 2.0 * (this.width + this.length);
        return res;
    }

    public Rectangle(double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
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

    @Override
    public String toString() {
        return "Rectangle[width=" + this.width + ",length="
                + this.length + ",color=" + super.getColor() +
                ",filled=" + super.isFilled() + "]";
    }

    public static void main(String[] args) {

    }
}
