import java.util.*;
public class sales {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("Enter the purchase amoubnt");
    double purchaseamount = input.nextDouble();
    double tax = purchaseamount* 0.06;
    System.out.println("Sales tax is $"+(int)(tax*100));
    }
    
}
