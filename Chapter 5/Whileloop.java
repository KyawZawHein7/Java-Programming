import java.util.*;
public class Whileloop{
    public static void main(String[] args) {
        
        int numbet1 = (int)(Math.random()*10);
        int numbet2 = (int)(Math.random()*10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " +numbet1+ "+"+numbet2+"? ");

        int answer= input.nextInt();
        while(numbet1+numbet2!=answer){
            System.out.print("Wrong answer.Try again.What is " +numbet1+ "+"+numbet2+"? ");
            answer = input.nextInt();
        }
        System.out.println("You got it.");

    }

}