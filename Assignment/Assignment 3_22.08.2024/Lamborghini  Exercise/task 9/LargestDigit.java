public class LargestDigit {
    public static void main(String[] args) {
        int number = 4825;
        int largest = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            number = number / 10;
        }

        System.out.println("The largest digit is: " + largest);
    }
}
