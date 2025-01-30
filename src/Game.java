import java.util.Random;
import java.util.Scanner;

public class Game {

    // Metoda do losowania liczby w zakresie 1-100
    static int numberDraw() {

        Random randomNumber = new Random();
        int guessNumber = randomNumber.nextInt(101);
        System.out.println("The number to guess has been drawn, good luck");
        return guessNumber;

    }

    // Metoda zawierające logikę poziomu trudności Easy
    static void easyMode() {

        for (int attemptsNumber = 0; attemptsNumber < 10; attemptsNumber++) {

            Scanner attemptScanner = new Scanner(System.in);
            System.out.println("Make a guess: ");
            int attempt = attemptScanner.nextInt();

            if (attempt > numberDraw()) {
                System.out.println("Too high.Try again.");
            } else if (attempt < numberDraw()) {
                System.out.println("Too low.Try again");
            } else {
                System.out.println("Congratulations! You win!");
                break;
            }
        }
    }

    // Metoda zawierające logikę poziomu trudności Medium
    static void mediumMode() {

        for (int attemptsNumber = 0; attemptsNumber < 7; attemptsNumber++) {

            Scanner attemptScanner = new Scanner(System.in);
            System.out.println("Make a guess: ");
            int attempt = attemptScanner.nextInt();

            if (attempt > numberDraw()) {
                System.out.println("Too high.Try again.");
            } else if (attempt < numberDraw()) {
                System.out.println("Too low.Try again");
            } else {
                System.out.println("Congratulations! You win!");
                break;
            }
        }
    }

    // Metoda zawierające logikę poziomu trudności Hard
    static void hardMode() {

        for (int attemptsNumber = 0; attemptsNumber < 5; attemptsNumber++) {

            Scanner attemptScanner = new Scanner(System.in);
            System.out.println("Make a guess: ");
            int attempt = attemptScanner.nextInt();

            if (attempt > numberDraw()) {
                System.out.println("Too high.Try again.");
            } else if (attempt < numberDraw()) {
                System.out.println("Too low.Try again");
            } else {
                System.out.println("Congratulations! You win!");
                break;
            }
        }
    }

    //Metoda wyświetlająca liczbę, jeśli gracz przegrał

    static int revealNumber() {
        System.out.println("Wylosowana liczba to: "+numberDraw()+".");
        return 0;
    }
}