public class Increment {
    public static void main(String[] args) {
        int x =1;
        System.out.println("Before callin the method x is "+x);
        increment(x);
        System.out.println("After calling method x is "+x);
        
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside method is "+n);
    }
    
}
