import java.util.Scanner;

public class Q6SquareRoot {
  
    public static int sqrt(int num, int low, int high) {
        if (low > high) { 
            return high; 
        }
        int mid = (low + high) / 2; 
        
        if (mid * mid == num) {
            return mid; 
        }
        
        if (mid * mid < num) {
            return sqrt(num, mid + 1, high); // Guess bigger
        }
        
        return sqrt(num, low, mid - 1); // Guess smaller
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = sqrt(number, 0, number); 
        System.out.println("The square root of " + number + " is: " + result); 
    }
}
