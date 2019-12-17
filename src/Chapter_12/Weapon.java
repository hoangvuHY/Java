package Chapter_12;

import java.io.Serializable;

public class Weapon implements Serializable {
    private String name;
    Weapon(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }


}
