import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TryCatchThrowFinally {
    public static void main(String[] args) {
        double a = 1.0;
        double b = -2.0;
        try{
            Excepciones1_5.positiveDivision(a,b);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        } catch (NumeroNegativoException e) {
            throw new RuntimeException(e);
        }
        finally{
            System.out.println("Valor final: "+a);
        }
    }
}
