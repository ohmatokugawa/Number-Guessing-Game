import java.util.Random;

public class numberGenerator {

   //Method to generate random number between 1 and 100

    public static int generate() {
        return new Random().nextInt(100) + 1;
    }
}