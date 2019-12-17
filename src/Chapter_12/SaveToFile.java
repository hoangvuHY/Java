package Chapter_12;

import java.io.*;
import java.util.concurrent.ExecutorService;

public class SaveToFile {
    public static void main(String[] args) {
        GameCharacter zombie = new GameCharacter(50,"Zombie");
        zombie.addWeapon(new Weapon("teeth"));
        zombie.addWeapon(new Weapon("hands"));
        zombie.addWeapon(new Weapon("boy"));

        GameCharacter peaShooter = new GameCharacter(50,"PeaShooter");
        peaShooter.addWeapon(new Weapon("Poison"));
        GameCharacter mushroom = new GameCharacter(40,"MagicMushroom");
        mushroom.addWeapon(new Weapon("light"));
        mushroom.addWeapon(new Weapon("gun"));

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("game.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            outputStream.writeObject(zombie);
            outputStream.writeObject(peaShooter);
            outputStream.writeObject(mushroom);

            outputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("game.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            GameCharacter o1 = (GameCharacter) inputStream.readObject();
            GameCharacter o2 = (GameCharacter) inputStream.readObject();
            GameCharacter o3 = (GameCharacter) inputStream.readObject();

            inputStream.close();

            System.out.println(o1);
            System.out.println(o2);
            System.out.println(o3);

        }catch (Exception e){
            e.printStackTrace();
        }






    }
}


