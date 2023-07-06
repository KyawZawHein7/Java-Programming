import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your score :");
        double score =input.nextDouble();
        if (score>=90){
            System.out.println("Your grade is A");
        }
        else if(score>=80){
            System.out.println("Your grade is B");
        
        }
        else if(score>=70){
            System.out.println("Your grade is C");
        }
        else if(score>=60){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }

    }
    
}
