public class TestMethodOverloading {
    public static void main(String[] args) {
        System.out.println("The maximun of two integers is "+max(5,6));
        System.out.println("The max of two doubles " +max(5.1,6.2));
        System.out.println("The maximun of 3.0, 5.4 and 10.4 is " +max(3.0,5.4,10.4));
        
    }
    public static int max(int num1, int num2){
        if (num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public static double max(double num1, double num2){
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }
    public static double max(double num1, double num2, double num3){
        return max(max(num1,num2),num3);

    }
    
}
