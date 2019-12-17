package Chapter_5;
//Làm lại bài này nếu rảnh
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice milk = new Invoice("21232","Drink",10,12);
        Invoice rice = new Invoice("212322","Eat",10,-12);
        Invoice tea = new Invoice("2123245","Drink",-10,8);
        double sumMilk = milk.getInvoiceAmount();
        System.out.println("Tổng giá tiền của milk là: " + sumMilk);
        double sumRice = milk.getInvoiceAmount();
        System.out.println("Tổng giá tiền của rice là: " + sumRice);
        double sumTea = milk.getInvoiceAmount();
        System.out.println("Tổng giá tiền của tea là: " + sumTea);

    }
}
