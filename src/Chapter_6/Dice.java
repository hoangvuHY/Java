package Chapter_6;

import java.io.*;

public class Dice {
    public int roll() {
        return (int) (Math.random() * (6 - 1) + 1) + 1;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int saveDice = dice.roll();
        System.out.println(saveDice);

        System.out.println();
        try {

            File f = new File("C:\\Users\\ABC\\HTML\\document_code_faster.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
