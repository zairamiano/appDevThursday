import java.util.Scanner;
import java.util.Random;

public class Gejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter two integers
        System.out.println("Enter the first integer: ");
        int firstInt = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int secondInt = scanner.nextInt();

        // Generate a random number between the two integers
        int randomNum = random.nextInt(Math.abs(secondInt - firstInt) + 1) + Math.min(firstInt, secondInt);

        // Display the random number
        System.out.println("Random number between " + firstInt + " and " + secondInt + ": " + randomNum);
    }
}