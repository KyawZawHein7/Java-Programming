
import java.util.Scanner;

public class Sec {
    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
        System.out.println("Enter the seconds in integers:");
       int seconds= input.nextInt();
       int minutes= seconds/60;

       int remaining_seconds= seconds%60;
       System.out.println(seconds+"seconds ="+minutes+" minutes and "+remaining_seconds+" seconds ");
        
    }


    }
