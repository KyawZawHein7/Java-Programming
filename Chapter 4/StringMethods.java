import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        String message = "Welcome to java";
        System.out.println("The lengt of "+message+" is  "+message.length());
        System.out.println("The first character of the messge is "+message.charAt(0));
        System.out.println("The message id in uppercase :"+message.toUpperCase());
        Scanner input =new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name.toUpperCase());
        String emailDB ="kyawzawhein197500@gmail.com";
        String emailIN= "kyawzawhein297500@gmail.com";
        System.out.println(emailDB.compareTo(emailIN));
        message= message.substring(0,11)+"HTML";
        System.out.println(message);
        System.out.println("Welcome to java".indexOf( "j"));
        String Fullname = "KKyaw Zaw Hein";
        int index =Fullname.indexOf("");
        String Firstname = Fullname.substring(0, index);
        System.out.println(Firstname);
        String LastName= Fullname.substring(index+1);
        System.out.println(LastName);
    }
    
}
