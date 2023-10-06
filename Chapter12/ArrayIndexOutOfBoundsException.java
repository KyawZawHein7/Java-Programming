import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Generate random integers between 0 and 999
        }

        // Prompt the user to enter an index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-99): ");
        int index = scanner.nextInt();

        // Check if the index is within bounds
        if (index >= 0 && index < array.length) {
            // Display the corresponding element value
            System.out.println("Element at index " + index + " is: " + array[index]);
        } else {
            // Index is out of bounds
            System.out.println("Out of Bounds");
        }

        scanner.close();
    }
}
