package Oppa10;
public class GenericCheck<T extends Number> {
    private T number;
    public GenericCheck(T number){
        this.number = number;
    }

    public double reciprocal(){
        return 1/number.doubleValue();
    }
/*

    public static class Box<T>{
        private T t;
        public void add(T t){
            this.t = t;
        }
        public T get(){
            return t;
        }
    }

*/
    /*public <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }*/

    public static void main(String[] args) {
        Integer[] arrI = {1,5,7,8,77,6,66,77,88};
        Double[] arrD = {1.5,7.8,96.76,76.9};
        Character[] arrC = {'4','g','u','i','o'};
/*
        GenericCheck genericCheck = new GenericCheck();
        System.out.println("Array Integer contains: ");
//        genericCheck.printArray(arrI);
        System.out.println("Array Double contains: ");
//        genericCheck.printArray(arrD);
        System.out.println("Array Character contains:");
//        genericCheck.printArray(arrC);
*/
/*
        Box<Integer> intBox = new Box<Integer>();
        Box<String> strBox = new Box<String>();
        Box<Double> doubleBox = new Box<Double>();
*/
/*
        intBox.add(10);
        strBox.add("Hello Oppa");
        doubleBox.add(12.578);
        System.out.println("Integer: " + intBox.get());
        System.out.println("String: " + strBox.get());
        System.out.println("Double: " + doubleBox.get());
*/
        GenericCheck<Integer> iGeneric = new GenericCheck<Integer>(5);
        System.out.println("Reciprocal: " + iGeneric.reciprocal());
        GenericCheck<Double> dGeneric = new GenericCheck<Double>(32.5);
        System.out.println("Reciprocal: "+ dGeneric.reciprocal());


    }
}
