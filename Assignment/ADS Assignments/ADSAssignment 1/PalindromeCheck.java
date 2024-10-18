import java.util.Scanner;

class PalindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        // Checking if the number is a palindrome
        if (isPalindrome(num, 0, num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        
        sc.close();
    }

    // Recursive function to check if a number is a palindrome
    static boolean isPalindrome(int num, int rev, int temp) {
        if (temp == 0) {
            return rev == num; // Base case: compare reversed number to the original
        }
        // Reverse the digits recursively
        rev = rev * 10 + temp % 10;
        return isPalindrome(num, rev, temp / 10);
    }
}
