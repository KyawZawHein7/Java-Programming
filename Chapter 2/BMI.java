import java.util.*;
public class BMI{
public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the weight in pounds :");
    double weight = input.nextDouble();
    System.out.print("Enter height in inches :");
    double height= input.nextDouble();
    double kilograms = weight*0.45359237;
    double meter = height*0.0254;
    double BMI =kilograms/(Math.pow(meter,2));
    System.out.println("BMI is"+BMI);
}
}