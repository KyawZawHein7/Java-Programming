import java.util.Scanner;

import java.util.*;
public class ComputeBMI{
public static void main(String[] args) {
    
    Scanner input= new Scanner(System.in);
    System.out.print("Enter the weight in pounds :");
    double weight = input.nextDouble();
    System.out.print("Enter height in inches :");
    double height= input.nextDouble();
    double kilograms = weight*0.45359237;
    double meter = height*0.0254;
    double BMI =kilograms/(Math.pow(meter,2));
    System.out.println("BMI is"+(int)BMI);
    if(BMI<18.5){
        System.out.println("Underweight");

    }
    else if(BMI<25){
        System.out.println("Normal");
    }
    else if(BMI<30){
        System.out.println("Overweight");
    }
    else{
        System.out.println("Obese");
    }

}
}
