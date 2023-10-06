import java.io.File;
import java.net.URL;
import java.io.IOException;
import java.io.PrintWriter;
public class WriteData {
    public static void main(String[] args) {
        File file = new File("Files/score.txt");
        if(file.exists()){
            System.out.println("File alrady exists");
            System.exit(1);
        }
    }
    //Creat a file 
    PrintWriter output = new PrintWriter(file);
    //Write the formated output to the file
    output.print("Kyaw Zaw Hein");
    output.println(90);
    output.print("Natthorn");
    output.println(85);
    output.close();


}
