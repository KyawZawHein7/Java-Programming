import java.util.Scanner;
public class QuotientWithmethod {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        //Prompt the user for two integer
        System.out.println("Enter two integers :");
        int number1 = input.nextInt();
        int numnber2 = input.nextInt();
        input.close();
        int result = Quotient(number1, numnber2);
        System.out.println(number1+" / "+numnber2+" is "+(number1/numnber2));
    }
    public static int Quotient(int number1 , int numnber2){
        if(numnber2==0){
            System.out.println("Division cannot be zero");
            System.exit(1);
        }
        return number1/numnber2;
    }
    
}
