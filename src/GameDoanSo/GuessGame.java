package GameDoanSo;

public class GuessGame {
    private static Player p1;
    private static Player p2;
    private static Player p3;
    public static void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessGame1 = 0;
        int guessGame2 = 0;
        int guessGame3 = 0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random()*5);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while(true){
            System.out.println("Number to guess is: ");
            p1.guess();
            p2.guess();
            p3.guess();
            guessGame1 = p1.tem;
            guessGame2 = p2.tem;
            guessGame3 = p3.tem;
            if(guessGame1 == targetNumber ){
                System.out.println(1);
                p1isRight = true;
            }
            if(guessGame2 == targetNumber ){
                //System.out.println(1);
                p2isRight = true;
            }
            if(guessGame3 == targetNumber ){
                //System.out.println(1);
                p3isRight = true;
            }
            if(p1isRight || p2isRight || p3isRight){
                //System.out.println(1);
                System.out.println("We have a winner!");
                System.out.println("{Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over");
                break;
            }else{
                //System.out.println(1);
                System.out.println("Player will have to try again.");
            }
        }
    }
}
