import java.util.*;
public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[]numbers = new double[10];
        System.out.println("Enter"+ numbers.length+" numbers :");
        int i;
        for ( i=0; i<numbers.length;i++)
         numbers[i] = input.nextDouble();

         double smallest = findsmallest(numbers);
         System.out.println("The smallest element is "+smallest);
    }
    public static double findsmallest(double[]numbers){
        double smallest =numbers[0];
        int i;
        for (i =0; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }

            
        }
        return smallest;
    }

    
}
