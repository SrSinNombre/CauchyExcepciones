public class AgeValidatorMain {
    public static void main(String[] args) {
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("La edad es válida: " + age);
    }
}
