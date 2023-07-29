public class PrimenumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are ");
        prime(50);
    
    }
    public static void prime(int primesnumbers){
        int number = 2;
        int count = 0;
        int numberofprimesnumbersperline= 10;
        
        while (count< primesnumbers){
        if (isprime(number)){
            count++;
            if (count % numberofprimesnumbersperline == 0){
                System.out.printf("%5d\n",number);
            }
            else{
                System.out.printf("%5d",number);
            }}
            number ++;

        }
        
    }
    public static boolean isprime(int number){
        for (int i = 2; i <= number/2; i ++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    
}