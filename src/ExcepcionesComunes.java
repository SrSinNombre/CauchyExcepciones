public class ExcepcionesComunes {

    public static void main(String[] args) {

        // NullPointerException
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Intentaste acceder a un objeto nulo " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esa posición no existe en la lista" + e.getMessage());
        }

        // Ejemplo 3: ArithmeticException
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("No sabes mates básicas o qué, eso no se puede hacer " + e.getMessage());
        }

        // Ejemplo 4: NumberFormatException
        try {
            String cadena = "abc";
            int numero = Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            System.out.println("No puedes convertir una cadena a un número tonto " + e.getMessage());
        }
        // Ejemplo 5: ClassCastException
        try {
            Object o = new Object();
            Integer i = (Integer) o;
        } catch (ClassCastException e) {
            System.out.println("No puedes convertir un objeto tipo" + e.getMessage());
        }
    }
}

