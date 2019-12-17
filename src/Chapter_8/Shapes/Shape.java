package Chapter_8.Shapes;

abstract public class Shape {
    protected int x,y;

/*    private Shape(int x){
        this.x = x;
    }*/

    protected Shape(int _x,int _y){
        x = _x;
        y  = _y;
    }


    abstract public void draw();
    abstract public void erase();

    public void move(int x,int y){
        erase();
        this.x = x;
        this.y = y;
        draw();
    }
}
