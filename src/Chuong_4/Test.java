package Chuong_4;

public class Test {
    String name;
    int id = 0;
    public static void main(String[] args) {
        Test[] h = new Test[5];
        int x = 0;
        while(x < 3){
            h[x] = new Test();
            h[x].id = x;
            x++;
        }
        h[3] = h[0];
        h[4] = h[1];
        h[3] = null;
        h[4] = h[0];
        h[0] = h[3];
        h[3] = h[2];
        h[2] = h[0];
        System.out.println(h[0] + "   " + h[4]);

    }
}
