import java.util.Scanner;
public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double square = number * number;
        System.out.println("The square of " + number + " is: " + square); //Group 6's method

        System.out.println("Cube: " + Calculator.cube(num1));  // Group 7's method
        System.out.println("Product: " + Calculator.multiply(num1, num2)); // Group 3's method
        System.out.println("Sum: " + Calculator.add(num1, num2));  // Group 1's method
        System.out.println("Max: " + Calculator.max(num1, num2));  // Group 8's method
        System.out.println("Difference: " + Calculator.subtract(num1, num2));  // Group 2's method
        System.out.println("Square Root: " + Calculator.sqrt(num1));  // Group 11's method
        System.out.println("Quotient: " + Calculator.divide(num1, num2));  // Group 4's
        System.out.println("Modulus: " + Calculator.modulus(num1, num2));  // Group 5 method
        System.out.println("Square: " + Calculator.square(num1));  // Group 6's method
     }
}
