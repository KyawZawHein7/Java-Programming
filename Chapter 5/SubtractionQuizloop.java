
import java.util.*;
public class SubtractionQuizloop {
    public static void main(String[] args) {
         final int Number_Of_Questions =5;
    int correctcount = 0;//Count the correct questions
    int count = 0;//Count the number of questions
    long starttime= System.currentTimeMillis();
    String output="";
    Scanner input =new Scanner(System.in);

    while(count < Number_Of_Questions){
        int number1 =(int)(Math.random()*10);
        int number2 =(int)(Math.random()*10);

        //Make sure number1 is > number2
        if(number1<number2){
            int temp=number1;
            number1= number2;
            number2=temp;
        }
        //Prompt the students to answer
        System.out.println("What is "+number1+" - "+number2+" ? ");
        int answer = input.nextInt();

        //Grade the students

        if(number1-number2==answer){
            System.out.println("You are correct\n");
            correctcount++;
        }
        else{
            System.out.println("Your answer is wrong.\n"+number1+"-"+number2+" should be "+(number1-number2)+"\n");

        }
        count++;
        output +="\n"+number1+" - "+number2+ " = "+answer+((number1-number2 == answer)?"correct":"wrong");

        long endtime = System.currentTimeMillis();
        long testtime = endtime -starttime;
        System.out.println("Correct count is "+correctcount+ "Testtime is "+testtime/1000+" second\n"+output);
  
    }  
    }
    
}
