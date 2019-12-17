package Oppa6B;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public double distance(Point point) {
        double xDiff = this.x - point.x;
        double yDiff = this.y - point.y;
        double res = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return res;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            if (this.getX() == other.getX() && this.getY() == other.getY())
                return true;
            else
                return false;
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
