public class Excepciones1_5 {
    private double a;
    private double b;

    public void setNumbers(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static double positiveDivision(double a, double b) throws DivideByZeroException,NumeroNegativoException  {
        if (b > 0 ^ a > 0) {
            throw new NumeroNegativoException("No puede dar un número negativo");
        }
        if(b == 0) {
            throw new DivideByZeroException("No se puede dividir zero");
        }
        else{
            return a/b;
        }
    }
}
