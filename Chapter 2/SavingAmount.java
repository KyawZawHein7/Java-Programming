import java.util.*;
public class SavingAmount {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the monthly saving amount :");
        double amount= input.nextDouble();
        double final_amount= amount*6;
        System.out.println("After six months, the amount value is"+final_amount);

        
    }
    
}
