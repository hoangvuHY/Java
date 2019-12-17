package Chapter_8.Shapes;

public class Circle extends Shape {
    private double radius;

/*    public Circle(int _x,int radius){
        super(_x);
        this.radius = radius
    }*/

    public Circle(int _x, int _y,double _radius) {
        super(_x, _y);
        radius = _radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle!");
    }

    @Override
    public void erase() {
        System.out.println("Erase Circle!");
    }
}
