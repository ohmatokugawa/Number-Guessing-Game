import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        // Start gry
        Scanner username = new Scanner(System.in);
        System.out.println("Hello, please enter your username");
        String userName = username.nextLine();

        // Zasady gry Number Guessing Game
        System.out.println("Welcome "+userName+" in Number Guessing Game");
        System.out.println("Let me describe rules of the game: ");
        System.out.println("1. You can choose level of difficulty (easy, medium or hard.)");
        System.out.println("2. After this the game will immediately begin.");
        System.out.println("3. Depends on level you choose you will have certain amount of attempts and time to guess a number between 1-100.");

        // Sprawdzenie gotowości gracza do gry
        Scanner gameStart = new Scanner(System.in);
        System.out.println("Are you ready? [Yes/No]");
        String start = gameStart.nextLine();

        if (start.equals("Yes")) {
            System.out.println("Let's start");
        }
        else {
            System.out.println("Thank you for your time. The game will shutdown");
        }
    }
}