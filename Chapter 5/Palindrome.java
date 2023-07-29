import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        scanner.close();

        // Convert the word to lowercase to ignore case sensitivity
        word = word.toLowerCase();

        // Remove any non-alphanumeric characters from the word
        word = word.replaceAll("[^a-z0-9]", "");

        // Check if the word is a palindrome
        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}

    
