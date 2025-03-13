import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its cube: ");
        int num = scanner.nextInt();
       
        System.out.println("Cube: " + Calculator.cube(num));  // Group 7's method
    }
}
