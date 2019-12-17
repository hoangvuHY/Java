package Chapter_8.Shapes;

import java.awt.Shape;

public class TestShape {

    public static void main(String[] args) {

        try{ // Bắt ngoại lệ
            int a[] = {1,2};
            System.out.println(a[5]); //=> //lỗi và chương không chạy xuống dòng dưới
            System.out.println("Hello!");
        }catch (Exception e ) {
            System.out.println("Lỗi truy cập tại vị trí của mảng");
        }
    }
}
