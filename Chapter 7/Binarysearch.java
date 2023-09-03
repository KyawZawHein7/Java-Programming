public class Binarysearch {
    public static void main(String[] args) {
        int[] mylist = {1,2,3,4,5,67,89,91,97};
        int i = binarySearch(mylist, 1);
        System.out.println("The index of the key is "+i);
    }
    public static int binarySearch(int[] list,int key){
        int high = list.length-1;
        int low = 0;
        while(high>=low){
            int mid = (high+low)/2;
            if(key<list[mid]){
                high = mid-1;
            }

             else if(key==list[mid]){ 
                return mid;
             }

            else
                low=mid+1;

        }
        return -low - 1;
    }

}