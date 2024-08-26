/*public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
}

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:5)

In Java, division by zero is an invalid operation for integer types, and it causes an ArithmeticException. This exception is thrown because dividing an integer by zero does not produce a finite or valid result.*/

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int result = a / b;
            System.out.println(result);
        }
    }
}
