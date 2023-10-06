import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for two integer
        System.out.println("Enter two integers :");
        int number1 = input.nextInt();
        int numnber2 = input.nextInt();
        input.close();
        if (numnber2!=0){
            System.out.println(number1+" / "+numnber2+" is "+(number1/numnber2));
        }
        else{
            System.out.println("Division cannot be zero");
        }
    }
    
}
