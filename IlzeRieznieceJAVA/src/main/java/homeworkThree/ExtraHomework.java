package homeworkThree;

import java.util.Random;
import java.util.Scanner;

public class ExtraHomework {
    public static void main(String[] args) {
        int attempts = 0;
        int guess;
        Random random = new Random();
// Generates random integers 0 to 50
        int x = random.nextInt(51);
        System.out.println("Guess the number from 0 to 50. You have 10 attempts! Write your number!");

        while (attempts <= 10 ) {
            attempts++;
            Scanner scanner = new Scanner(System.in);
            guess = scanner.nextInt();
            if ( guess == x ) {
                System.out.println("Correct, the number is " + x + ", you found it in " + attempts + " times" );
                break;
            }
            else if ( guess < x && attempts <10 ) {
                System.out.println("Your number is lower.");
                System.out.println("Write new number!");
            }
            else if ( guess > x && attempts <10) {
                System.out.println("Your number is bigger.");
                System.out.println("Write new number!");
            }
            else {
                System.out.println("You lost the game!");
            }
        }
    }
}