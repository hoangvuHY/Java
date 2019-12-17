package Chapter_12;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    private int health;
     private String type;
    private Weapon[] weapons;
    private int weaponCount;

    GameCharacter(int h, String t) {
        health = h;
        type = t;
        weaponCount = 0;
        weapons = new Weapon[10];
    }

    void addWeapon(Weapon w) {
        weapons[weaponCount] = w;
        weaponCount++;
    }

    public String toString() {
        String s = this.health + "," + type;
        for (int i = 0; i < weaponCount; i++) {
            s = s + "," + weapons[i];
        }
        return s;
    }

}
