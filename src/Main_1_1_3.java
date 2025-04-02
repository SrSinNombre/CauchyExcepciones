import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main_1_1_3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
        }
        catch (FileNotFoundException ex){
            System.out.println("File Not Found");
        }
        catch (IOException ex){
            System.out.println("IO Exception");
        }
    }
}
