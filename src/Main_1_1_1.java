import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main_1_1_1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
