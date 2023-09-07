

import java.util.*;
public class Array_InputValues {
    public static void main(String[] args) {
        //Creat a 2D array
        int[][] matrix = new int [3][3];

        // Ask the user to input values in 2D Array

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values in "+ matrix.length+ " rows "+ matrix[0].length+" columns");
        int row;
        int col;
        for(row = 0; row< matrix.length; row ++){
            for(col = 0; col<matrix[0].length;col++){
                matrix[row][col]= input.nextInt();
                 System.out.println(matrix[row][col]+ " ");
             }
        }
        input.close();
            
    }
    
}
