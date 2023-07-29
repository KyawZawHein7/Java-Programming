import java.util.*;
public class GCD {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Find the minimum of the two numbers
        int min = Math.min(num1, num2);

        int gcd = 1; // Initialize GCD to 1
        int i = 1; // Start with i = 1

        while (i <= min) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update GCD if both numbers are divisible by i
            }
            i++;
        }

        System.out.println("The greatest common divisor (GCD) of " + num1 + " and " + num2 + " is " + gcd);
    }
}

    
