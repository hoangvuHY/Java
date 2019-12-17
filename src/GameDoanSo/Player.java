package GameDoanSo;

import java.util.Scanner;

public class Player {
    public int num;
    public int tem;
    public static final Scanner scanner = new Scanner(System.in);
    public void guess(){
        int num = scanner.nextInt();
         tem = num;
        System.out.println("I'm guessing " + tem);
    }
}
