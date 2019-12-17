package Chapter_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int shipCount = 0;

    public String getUseInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + "   ");
        try {
            InputStream in;
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException is: " + e);
        }
        if (inputLine == null) throw new AssertionError();//Neu nhap ky tu k phai no van hien ra man hinh
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeShip(int size) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphaCoord = new String[size];// holds 'f6' types coords
        String temp = null; // temporary String for concat
        int[] coords = new int[size];// current cancdidate coords
        int attempts = 0;//current attempts counter
        boolean success = false; // flag = found a good location?
        int location = 0;// current starting location
        shipCount++;//nth ship to place
        int incr = 1;//set horizontal increment
        if (shipCount % 2 == 1) {//if odd ship(place vertically)
            incr = gridLength;//set vertical increment
        }
        while (!success && attempts++ < 200) { // main search loop
            location = (int) (Math.random() * gridSize);//get random starting point
            System.out.println("Try " + location);
            int x = 0; // nth position in ship to place
            success = true;// assume success
            while (success && x < size) {//look for adjacent unused spoys
                if (grid[location] == 0) {// if not already used
                    coords[x++] = location;//save location
                    location += incr;//try 'next' adjacent
                    if (location >= gridSize) {//out of bounds-'bottom'
                        success = false;//failure
                    }
                    if (x > 0 && location % gridLength == 0) { // out of bounds - right edge
                        success = false;
                    }
                } else {    // found already used location
                    System.out.println("Used " + location);
                    success = false;
                }
            }
        }

        int x = 0;//turn good location into a alpha coords
        int row = 0;
        int column = 0;
//        System.out.println("\n");
        while (x < size) {
            grid[coords[x]] = 1;//mark master grid pts. as 'used'
            row = (int) (coords[x] / gridLength);// get row value
            column = coords[x] % gridLength; // get numeric column value
            temp = String.valueOf(alphabet.charAt(column));//covert to alpha
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
//            System.out.println("  coord " +x + "="+ alphaCells.get(x-1))
        }
//        System.out.println("\n");
        return alphaCells;
    }
}
