import java.util.Scanner;


public class FactorialOfNumber {
  public static void main(String [] args){
      int number;
      System.err.println("enter the number");
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
      int answer = factorial  (number);
      System.err.println("factorial of "+ number + " is "+ answer);
      sc.close();

  }
  static int factorial (int n){
    if (n == 1)
    return 1;
    
    return n * factorial(n-1);

  }
  
}
