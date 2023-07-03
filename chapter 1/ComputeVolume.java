
import java.util.Scanner;
public class ComputeVolume {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double Area;
        double volume;

        final double PI = 3.14;
        System.out.print("Enter the radius and length");
       double radius =input.nextDouble();
       double length = input.nextDouble();
       Area = radius*radius*PI;
       System.out.println("The area is"+ Area);
       volume= Area*length;
       System.out.println("The volume of the cylinder is "+volume);





    }
    
}
