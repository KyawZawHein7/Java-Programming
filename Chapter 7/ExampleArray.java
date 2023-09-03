public class ExampleArray{
    public static void main(String[] args) {
        double[]mylist= new double[10];
        // mylist[0]= 5.6;
        // mylist[1]= 7.6;
        // mylist[2]= 5.6;
        // mylist[3]= 5.6;
        // mylist[4]= 5.6;
        // mylist[5]= 5.6;
        // mylist[6]= 5.6;
        // mylist[7]= 5.6;
        // mylist[8]= 5.6;
        // mylist[9]= 5.6;

        for(int i=0;i<mylist.length;i++){
            mylist[i]=i+3;
        }
        System.out.println(mylist[0]);
        System.out.println(mylist[2]);
        System.out.println(mylist[3]);

        // double[]my = {1.9, 2.9, 3.4, 3.5};
        // System.out.println(my.length);
    }
}