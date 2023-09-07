import java.util.Scanner;
public class SumElementsColumnByColumn {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        int row;
        int col;
        for (row = 0; row < matrix.length; row++){
            for(col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }
        double maxofcol = 0;
        double maxofcol1 = 0;
        double maxofcol2 = 0;
        double maxofcol3 = 0;
        for(row=0; row < matrix.length; row++ ){
             maxofcol += matrix[row][0];
        
       }
       for(row=0; row < matrix.length; row++ ){
             maxofcol1 += matrix[row][1]; 
       }
       for(row=0; row < matrix.length; row++ ){
             maxofcol2 += matrix[row][2]; 
       }
       for(row=0; row < matrix.length; row++ ){
             maxofcol3 += matrix[row][3]; 
       }
       System.out.println("Sum of the elements at column 0 is " +maxofcol);
       System.out.println("Sum of the elements at column 1 is " +maxofcol1);
       System.out.println("Sum of the elements at column 2 is " +maxofcol2);
       System.out.println("Sum of the elements at column 3 is " +maxofcol3);



    }
    
}
