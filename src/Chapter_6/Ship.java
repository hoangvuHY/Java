package Chapter_6;

import javax.swing.*;
import java.util.ArrayList;

public class Ship {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String string) {
        name = string;
    }
    public String check(String UseInput){//Nguoi choi nhap toa do ban
        String result = "miss";
        int index = locationCells.indexOf(UseInput);//Trả về vị trí đầu tiên của ký tự trong shot
        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        return result;
    }
}
