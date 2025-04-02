public static void methodC() {
    System.out.println("Enter methodC()");
    System.out.println(1 / 0); // divide-by-0 triggers an ArithmeticException
    System.out.println("Exit methodC()");
}
}
