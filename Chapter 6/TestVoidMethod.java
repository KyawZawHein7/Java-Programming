public class TestVoidMethod {
    public static void main(String[] args) {
        printgrade(90);
        
    }
    //This is my printgrade method to print grades of students
    public static void printgrade(double score){
        if (score>= 90){
            System.out.println("A");
        }
        else if(score>=80){
            System.out.println("B");
        }
        else if(score>=70){
            System.out.println("C");
        }
        else if(score>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
