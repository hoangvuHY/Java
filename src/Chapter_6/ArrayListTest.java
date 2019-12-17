package Chapter_6;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String a = new String("Hello");
        list.add(a);
        String b = new String("Goodbye");
        list.add(0,b);
        System.out.println("List size is " + list.size());
        if(list.contains("Hello")){
            System.out.println("Hello is in");
        }
        System.out.println("Index of "+ a + " is " + list.indexOf(a));
        System.out.println("List is empty?"+list.isEmpty());
        list.remove(a);
        int i = 10;
        int iWrap = i;
        System.out.println(iWrap);
        i = Integer.parseInt("10");
        System.out.println(i);
        String iString = Integer.toString(i);

        System.out.println(iString);

        String abc = "";
        abc.concat("0");

    }
}
