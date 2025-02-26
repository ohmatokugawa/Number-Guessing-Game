import java.util.Scanner;
import java.util.concurrent.*;

public class Game {

    public static final int TIME_LIMIT = 30; // Time limit


    public static void start() {

        Scanner scanner = new Scanner(System.in);

        // Checking if the player is ready (Time is starting after choosing yes)
        while (true) {
            System.out.print("Are you ready? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("yes")) {
                break;
            } else if (response.equals("no")) {
                System.out.println("Okay, take your time. Let me know when you're ready.");
            } else {
                System.out.println("Invalid response! Please type 'Yes' or 'No'.");
            }
        }

        int guessNumber = numberGenerator.generate();
        startTimer(guessNumber);
    }

    private static void startTimer(int guessNumber) {
        System.out.println("You have " + TIME_LIMIT + " seconds to guess the number!");

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable timeOutTask = () -> {
            System.out.println("\nTime's up! The correct number was: " + guessNumber);
            System.exit(0);
        };

        scheduler.schedule(timeOutTask, TIME_LIMIT, TimeUnit.SECONDS);

        playGame(guessNumber, scheduler);
    }


    private static void playGame(int guessNumber, ScheduledExecutorService scheduler) {
        System.out.println("Guess a number between 1 and 100. You have 10 attempts!");

        for (int attempts = 0; attempts < 10; attempts++) {
            int attempt = inPutHandler.getUserInput();

            if (attempt > guessNumber) {
                System.out.println("Too high! Try again.");
            } else if (attempt < guessNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                return;
            }
        }
        revealNumber(guessNumber);
    }
    // Method that reveals draw number if player lose
    public static void revealNumber(int guessNumber){
        System.out.println("Game over! The correct number was: " + guessNumber);
    }
}



