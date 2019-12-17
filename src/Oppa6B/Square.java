package Oppa6B;

public class Square extends Rectangle {
    public Square() {
        super();//Gọi trực tiếp đến Constructor của lớp Rectangle
    }

    public Square(double side) {
        super(side, side); // Tức là chiều dài bằng chiều rộng
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft,side, side, color, filled);
    }
    public void setSide(double side) {
        setLength(side);// Cho chiều rộng bằng side
        setWidth(side);// Cho chiều dài bằng side
    }

    @Override
    public void setWidth(double side) {
        //Gọi phương thức của lớp Rectangle
        super.setWidth(side);//Tham chiếu trực tiếp đến biến instance của lớp Rectangle
        super.setLength(side);//Cho giá trị side cạnh bằng dài và rộng của Rectangle
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);//Tham chiếu trực tiếp đến biến instance của lớp Rectangle
        super.setLength(side);//Cho giá trị side cạnh bằng dài và rộng của Rectangle
    }

    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square other = (Square) obj;
            if (this.getSide() == other.getSide() && other.getTopLeft().equals(super.getTopLeft())) {
                return true;
            }
            else
                return false;
        }
        return false;
    }
    //Square[topLeft=(10.0,5.0),side=8.0,color=RED,filled=true]
    public String toString() {
        return ("Square[topLeft=(" + super.topLeft.getX() + "," + super.topLeft.getY() + "),side="
                + this.getSide() + ",color=" + super.getColor() +
                ",filled=" + super.isFilled() + "]");
    }

    public static void main(String[] args) {

    }
}
