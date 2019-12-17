package Oppa6B;
import java.util.*;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
    public void removeCircles(){
        for (int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i) instanceof Circle){
                this.shapes.remove(i);
                i--;
            }
        }
    }
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size() ; i++) {
            for (int j = i+1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j)) ){
                    this.shapes.remove(j);
                    j--;
                }
            }
        }
    }

    /*public String getInfo() {
        String res = "Layer of crazy shapes: \n";
        for (int i = 0; i < shapes.size(); i++) {
            res += shapes.get(i).toString() + "\n";
        }
        return res;
    }*/
    public String getInfo() {
        StringBuilder res = new StringBuilder("Layer of crazy shapes: \n");
        for (int i = 0; i < shapes.size(); i++) {
            res.append(shapes.get(i).toString()).append("\n");
        }
        return res.toString();
    }

    public static void main(String[] args) {/*
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());*/
    }
}