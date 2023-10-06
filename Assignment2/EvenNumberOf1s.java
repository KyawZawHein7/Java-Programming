import java.util.Scanner;
public class EvenNumberOf1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 x 6 matrix of 0 and 1 :");
        int[][] matrix = new int[6][6];
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length;j++ ){
                matrix[i][j]= input.nextInt();
            }
            System.out.println();
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Index row of Even number of 1s :");
        for(int row  = 0; row < matrix.length; row++){
            int totalRow = 0;
            int indexofrow = 0;
            for (int col = 0; col < matrix[0].length; col++ ){
                totalRow += matrix[row][col];
            }
        if(totalRow %2==0 && totalRow > 1){
            indexofrow = row;
            System.out.println(indexofrow+" ");
        }
        }
        System.out.println();
        System.out.println("Index of column of Even number of 1s :");
        for( int col = 0; col < matrix[0].length; col++){
            int totalcol = 0;
            int indexofcol = 0;
            for(int row = 0; row < matrix.length; row++){
                totalcol += matrix[col][col];
            }
            if( totalcol %2 == 0 && totalcol> 2){
                indexofcol = col;
                System.out.println(indexofcol+" ");
            }
        }
    }
    
}
