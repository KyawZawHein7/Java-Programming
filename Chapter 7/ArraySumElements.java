public class ArraySumElements {
    public static void main(String[] args) {
        
        //Create an array
        double[]mylist= new double[5];

        //Initialize array with random variables
        int i;
        for(i=0; i<mylist.length;i++){
            mylist[i]= Math.random()*10;        
        }

        //Summing all the elements
        double total =0;
        for (i =1;i<mylist.length;i++){
            System.out.println(mylist[i]+"");
            total=total+mylist[i];
        }
        System.out.printf("\nSum of all th elements is %5.2f",total);
    }
    
}
