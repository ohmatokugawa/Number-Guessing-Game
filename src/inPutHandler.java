import java.util.Scanner;

public class inPutHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getUserInput() {
        while (true) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        }
    }
}

