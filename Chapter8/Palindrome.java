import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String name = input.next();
        int length = name.length();
        String lower = name.toLowerCase();
        int left = 0;
        int right = length-1;
        boolean isPalindrome = true;
        while (left<right){
            if (lower.charAt(left) != lower.charAt(right)){
                isPalindrome = false;

        }
        left ++;
        right --;
    }
    if (isPalindrome){
        System.out.println("It is palindrome");
    }
    else{
        System.out.println("It is not palindrome");
    }


}
}
