import java.util.*;
public class AreaOfHexagon{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the length of the side :");
        double length =input.nextDouble();
        double Area_of_hexagon=(3*Math.sqrt(3))/2*Math.pow(length,2);
        System.out.println("The area of Hexagon is"+Area_of_hexagon);

    }

}