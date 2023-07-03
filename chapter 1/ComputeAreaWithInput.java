
import java.util.Scanner;

public class ComputeAreaWithInput {
    public static void main(String[] args) {
        // Creat a scanner object
        Scanner input = new Scanner(System.in);
        // prompt user to enter the input
        System.out.print("enter a number for radius:");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of the radius " + radius + " is " + area);
    }

}
