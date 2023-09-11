import java.util.Date;
public class TheDateclass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1, 1970 is "+date.getTime()+" millideconds");
        System.out.println(date.toString());

    }

    
}
