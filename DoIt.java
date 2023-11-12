import java.util.Scanner;
import java.util.Random;

public class DoIt {
    private int computerNumber;
    private int guess;
    private int min, max; 

    public DoIt() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int computerNumber = r.nextInt(50);
        System.out.println(computerNumber);
        System.out.println("Please type in your guess: ");

        do {
            int guess = sc.nextInt();
            if (guess == computerNumber) {
            System.out.println("You guessed it right.");
            System.exit(1);
            } else if (guess > computerNumber) {
            System.out.println("You guessed incorrectly, please try again with a smaller number.");
            } else {
            System.out.println("The number you typed in was too small. Guess again.");
            }
        } while(guess > computerNumber || guess < computerNumber);
    }
}