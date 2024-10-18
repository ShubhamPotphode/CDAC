import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        scanner.close();
    }
}
