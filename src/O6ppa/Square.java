package O6ppa;

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

    @Override
    public String toString() {
        return ("Square[side=" + this.getSide() + ",color=" + super.getColor() +
                ",filled=" + super.isFilled() + "]");
    }

    public static void main(String[] args) {

    }
}
