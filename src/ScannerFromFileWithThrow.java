import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
// to be handled by next higher-level method
        Scanner in = new Scanner(new File("test.in"));
// this method may throw FileNotFoundException
// main logic here ...
    }
}
