

public class SummingElements {
    public static void main(String[] args) {
        
        int[][] matirx = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int maxofrow =0;
        int indexofrow =0;

        //Get sum of elements in the first row
        int row;
        int col;
        for (col = 0; col<matirx[0].length;col++){
            maxofrow += matirx[0][col];
        }
        //Get the sum of the elements in other rows
        for(row = 1; row< matirx.length; row++ ){
            int totalofthis =0;
            for(col =0; col<matirx[0].length; col++){
                totalofthis += matirx[row][col];
            }
            if(totalofthis> maxofrow){
                maxofrow = totalofthis;
                indexofrow = row;
            }

        }
        System.out.println("Row "+ indexofrow+ " has the max sum of "+maxofrow);
    }
    
}
