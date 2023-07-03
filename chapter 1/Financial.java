import java.util.Scanner;
public class Financial {
    public static void main(String[] args) {
        Scanner input= new java.util.Scanner(System.in);
        System.out.print("Enter substotal and gratuity rate");
        double substol =input.nextDouble();
        double gratuity_rate= input. nextDouble();
        double percent= (substol/100)*gratuity_rate;
        double total= substol+percent;
        System.out.println("The gratuity is $"+percent+"and total is $"+total);

    }
    
}
