public class NumeroNegativoExceptionTest {
    public static String verificarNumeroPositivo(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("El número no puede ser negativo.");
        }
        return "El número " + numero + " es positivo.";
    }
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            String resultado = verificarNumeroPositivo(numero);
            System.out.println(resultado);
        }
        catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("Por favor, introduce un número válido.");
        }
    }
}

