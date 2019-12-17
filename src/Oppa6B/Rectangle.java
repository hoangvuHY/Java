package Oppa6B;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;


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

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft =  topLeft;
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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Rectangle other = (Rectangle) obj;
            if (this.getLength() == other.getLength() && this.getWidth() == other.getWidth() && this.getTopLeft().equals(other.topLeft)) {
                return true;
            }
            else
                return false;
        }
        return false;
    }
    //Rectangle[topLeft=(10.0,5.0),width=8.0,length=6.0,color=RED,filled=true]
    public String toString() {
        return "Rectangle[topLeft=(" + this.topLeft.getX() + "," + this.topLeft.getY()
                + "),width=" + this.width + ",length="
                + this.length + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }


    public static void main(String[] args) {

    }
}
