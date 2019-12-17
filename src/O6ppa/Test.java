package O6ppa;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);//UpCasting
        System.out.println(s1); // Thong tin cua hinh tron
        System.out.println(s1.getArea()); // Dien tich hinh tron
        System.out.println(s1.getPerimeter()); // Chu vi hinh tron
        System.out.println(s1.getColor()); // Khong the ra
        System.out.println(s1.isFilled()); // Khong ra
        //System.out.println(s1.getRadius()); // ERROR! Shape khong co phuong thuc getRadius

        Circle c1 = (Circle) s1; // Down Cast
        System.out.println(c1); // tra va cac noi dung cua hinh tron
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); Shape là một lớp trừu tượng nên không thể khai báo khởi tạo

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);//Up cast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // ERROR! Shape k co phuong thuc getLength()

        Rectangle r1 = (Rectangle)s3; // Down Casting Cha xuống con
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Up Casting Con lên cha
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); ERROR! Shape k co phuong thuc getSide()


        Rectangle r2 = (Rectangle)s4; // Down Casting Shape đến Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); ERROR Rectangle không có phương thức getSide
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; //Down Casting Rectangle đến Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());


    }
}
