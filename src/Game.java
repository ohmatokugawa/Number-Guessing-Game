import java.util.Random;
import java.util.Scanner;

public class Game extends Main {

    // Metoda do losowania liczby w zakresie 1-100
    static int numberDraw() {
        Random randomNumber = new Random();
        int guessNumber = randomNumber.nextInt(101);
        System.out.println("The number to guess has been drawn, good luck.");
        return guessNumber;
    }

    // Metoda zawierające logikę poziomu trudności Easy
    static void easyMode(int guessNumber) {
        System.out.println("In this mode you have 10 attempts");
        for (int attemptsNumber = 0; attemptsNumber < 10; attemptsNumber++) {

            Scanner attemptScanner = new Scanner(System.in);
            System.out.println("Make a guess: ");
            int attempt = attemptScanner.nextInt();
            public easyMode(){
                int attempt;
            }

            if (attempt > guessNumber) {
                System.out.println("Too high.Try again.");
            } else if (attempt < guessNumber) {
                System.out.println("Too low.Try again");
            } else {
                System.out.println("Congratulations! You win!");
                Game.revealNumber();
                break;
            }
        }
        System.out.println("Sorry, you lost");
        System.out.println("XD");
        Game.revealNumber();
    }

    //Metoda wyświetlająca liczbę, jeśli gracz przegrał
    static int revealNumber() {
        System.out.println("Draw number is: "+numberDraw()+".");
        return 0;
    }

    //Metoda sprawdzająca liczbę
    static int checkNumber(){
        if (easyMode();
    }
}