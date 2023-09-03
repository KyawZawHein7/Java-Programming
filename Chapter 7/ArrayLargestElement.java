public class ArrayLargestElement {
    public static void main(String[] args) {
        float[]mylist=new float[5];
        int i;
        for(i = 0; i<mylist.length;i++){
            mylist[i]=(float)Math.random()*10;
        }
        for (i=0; i<mylist.length;i++){
            System.out.println(mylist[i]+"");
        }
        float max =mylist[0];
        int indexofmax =0;
        for(i=1;i<mylist.length;i++){
            if (mylist[i]>max){
                max=mylist[i];
            }
        }
        System.out.println("Index o first max values "+indexofmax);
        System.out.println("Largest element in the array is "+max);
    }
    
}
