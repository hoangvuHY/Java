package Chapter_5;

import javax.xml.crypto.Data;

public class SecuredCow {
    private Data birthDate;
    private int age;
    public void setAge(int a){
        if(a>0){
            age = a;
        }else{
            System.out.println("age < 0. Mac dinh age = 0");
        }
    }
    public int getAge(){
        return age;
    }
    void momo(){
        if(age<=5){
            System.out.println("Moooooooo...");
        }
        else {
            System.out.println("Moo.");
        }
    }

    public static void main(String[] args) {
        SecuredCow cow = new SecuredCow();
        cow.setAge(-2);
        cow.momo();
        System.out.println(cow.getAge());
    }
}
