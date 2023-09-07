

public class Randomshuffling {
    public static void main(String[] args) {
        int[][] matirx ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};

    // Generate random indexdes
    int row;
    int col;
    for (row = 0; row < matirx.length; row++){
        for(col = 0; col < matirx[0].length; col++){
            int i1 = (int)(Math.random()*matirx.length);
            int j1 = (int)(Math.random()*matirx[0].length);
            //SWAP matrix[i][j] with matrix[i1][j1]

            int temp = matirx[row][col];
            matirx[row][col]= matirx[i1][j1];
            matirx[i1][j1] = temp;

        }
    }
    for(row = 0; row < matirx.length; row++){
        for (col =0; col < matirx[0].length; col++){
            System.out.print(matirx[row][col]);
        }
        System.out.println();
    }
    }
    
}
