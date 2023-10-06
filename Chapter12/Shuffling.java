public class Shuffling {
    public static void main(String[] args) {
        //creat an array
        int[] mylist = new int[10];
        //Array before shuffling 
        System.out.println("Array before shuffling : ");
        int i;
        for (i=0; i<mylist.length; i++){
            mylist[i]= (int)(Math.random()*mylist.length);
            System.out.println(mylist[i]+"");
        }
        //Array after shuffling
        System.out.println("Array after shuffling :");
        for ( i =0; i<mylist.length; i++){
            int j;
            j =(int)(Math.random()*mylist.length);
            //Swap i with j
            int temp =mylist[i];
            mylist[i]=mylist[j];
            mylist[j]=temp;
            System.out.println(mylist[i]+"");
        }
    }
    
}
