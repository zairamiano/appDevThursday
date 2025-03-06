import java.util.Scanner;

public class Cruz {
    public static void display() {
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        
        // Ask for the user's age
        System.out.print("How old are you, " + name + "? ");
        int age = scanner.nextInt();
        
        // Calculate and display the age next year
        System.out.println("Hello, " + name + "! You are currently " + age + " years old.");
        System.out.println("Next year, you will be: " + (age + 1) + " years old.");
    }
}
