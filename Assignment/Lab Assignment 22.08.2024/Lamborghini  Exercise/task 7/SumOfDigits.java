public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;

        while (number > 0) {
            sum += number % 10; 
            number = number / 10;
        }

        System.out.println("Sum of the digits: " + sum + " (9 + 8 + 7 + 6)");
    }
}

