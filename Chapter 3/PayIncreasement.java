import java.util.*;
public class PayIncreasement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your payment :");
        double payment= input.nextDouble();
        if(payment>90){
        double new_payment= payment +(payment*0.03);
        System.out.println("Your increase p0ayment is"+new_payment);}
        else {
            double another_payment= payment +(payment*0.01);
            System.out.println("Your new payment after 1% increasement is "+ another_payment);
        }

    
    
    
    

    }
    
}
