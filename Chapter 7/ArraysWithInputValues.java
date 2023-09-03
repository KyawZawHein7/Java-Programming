import java.util.*;

public class ArraysWithInputValues {
    public static void main(String[] args) {
        double[] mylist= new double[5];
        
        //Initialize the array with user inputs
        Scanner input = new Scanner(System.in);
        int i;
        System.out.print("Enter "+mylist.length+" values");
        for (i = 0;i < mylist.length;i++){
            mylist[i]=input.nextDouble();
        }
        input.close();

        //DIsplay the arrays 
        for (i=0;i < mylist.length;i++){
            System.out.println(mylist[i]+"");
        }
    }
    
}
