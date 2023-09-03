public class PassArrayToMethod {
    public static void main(String[] args) {
        int[] myarray = {1,2,3,4};
        printArray(myarray);

    }
    public static void printArray(int[] array) {
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }

    }
}