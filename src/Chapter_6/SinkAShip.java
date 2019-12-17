package Chapter_6;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SinkAShip {
    private GameHelper helper = new GameHelper();
    private ArrayList<Ship> shipList = new ArrayList<Ship>();
    private int numOfGuesses = 0;//Doan so
    private void setUpGame(){
        Ship one = new Ship();
        one.setName("Sink A Ship One");
        Ship two = new Ship();
        two.setName("Sink A Ship Two");
        Ship three = new Ship();
        three.setName("Sink A Ship Three");
        shipList.add(one);
        shipList.add(two);
        shipList.add(three);
        System.out.println("You goal is to sink three ships.");
        System.out.println("Sink A Ship One, Sink A Ship Two, Sink A Ship Three");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for (Ship shipSet : shipList){
            ArrayList<String> newLocation = helper.placeShip(3);
            shipSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        while (!shipList.isEmpty()){
            String userGuess = helper.getUseInput("Enter a guesses");
            checkUserGuess(userGuess);
        }
        finishGame();
    }


    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (Ship shipToTest : shipList) {
            result = shipToTest.check(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                shipList.remove(shipToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All the Ships are suck! You're now the king of the sea!");
        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses");
                System.out.println("You got out before your options sank!");
        }else{
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
        }
    }

    public static void main(String[] args) {
        SinkAShip game = new SinkAShip();
        game.setUpGame();
        game.startPlaying();
    }
}
