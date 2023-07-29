import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        
        //Display the number title 
        System.out.println("     ");
        for(int j = 1; j<10;j++){
            System.out.print("     "+j);
        }
        System.out.println("\n-----------------------------------------------------------");
        for(int i =1; i < 10; i++){
           System.out.print( i +" | ");
           for (int j =1;j<10;j++){
            System.out.printf("%5d",i*j);}

               System.out.println("       ");
           }
        


    }
    
}
