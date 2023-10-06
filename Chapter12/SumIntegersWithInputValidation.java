import java.util.InputMismatchException;
import java.util.Scanner;

public class SumIntegersWithInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        // Prompt the user for the first integer
        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();
                break; // Input is valid, exit the loop
            } catch (InputMismatchException e) {
                // Input is not an integer, handle it in the catch block
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        // Prompt the user for the second integer
        while (true) {
            try {
                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();
                break; // Input is valid, exit the loop
            } catch (InputMismatchException e) {
                // Input is not an integer, handle it in the catch block
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        // Calculate and display the sum
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        scanner.close();
    }
}
