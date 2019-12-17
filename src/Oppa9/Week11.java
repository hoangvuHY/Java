package Oppa9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week11 {
    public static final <T extends Comparable<T>> List<T> sortGeneric(List<T> arrList){
        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = i + 1; j < arrList.size() ; j++) {
                if(arrList.get(i).compareTo(arrList.get(j))>0){ // arr i  =3 ,arr j =4
                    T temp = arrList.get(i);//temp =3;
                    arrList.set(i,arrList.get(j));// ari = 4
                    arrList.set(j,temp);//arr j = 3
                }
            }
        }
        return arrList;
    }


/*
    import java.util.Collections;
    import java.util.List;
    
    public class  Week11 {
        public static <T extends Comparable< T>> List<T> sortGeneric(List<T > arr){
            Collections.sort(arr);
            return arr;
        }
    }
*/

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(38);
        arr.add(3665);
        arr.add(356);
        arr.add(34);
        arr.add(3889);
        arr.add(39889);
        arr.add(39);
        List<Integer> aws = new ArrayList<>();
           aws = sortGeneric(arr);
        for(int x : aws){
            System.out.print(x+" ");
        }

    }
}
