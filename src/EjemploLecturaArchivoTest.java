import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploLecturaArchivoTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("archivo_inexistente.txt"))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Excepción: El archivo no fue encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Se produjo una excepción inesperada: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Bloque finally: Fin de la operación de lectura de archivo.");
        }
    }
}