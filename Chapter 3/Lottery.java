import java.util.*;
public class Lottery {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    System.out.print("Entre your number :");
    int number=input.nextInt();
    int first_number= number/10;
    int second_number=number%10;
    int lottery=(int)(Math.random()*99);
    int lottery1=lottery/10;
    int lottery2=lottery%10;
    System.out.println("Lottery numbver is "+lottery1+""+lottery2);
    if(first_number==lottery1 && second_number==lottery2){
        System.out.println("You won $10000");
    }
    else if(lottery1==second_number && lottery2==first_number){
        System.out.println("you win $5000");
    }
    else if(lottery1==first_number || lottery2==first_number && lottery1==second_number||lottery2==second_number){
        System.out.println("You won $1000");
    }
    else{
        System.out.println("You lose");
    }
    



    }

    }
    
