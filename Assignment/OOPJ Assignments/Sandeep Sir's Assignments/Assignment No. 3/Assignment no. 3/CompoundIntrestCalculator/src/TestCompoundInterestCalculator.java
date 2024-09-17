import java.util.Scanner;

public class TestCompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();

        
        System.out.print("Enter the initial investment amount (₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in decimal, e.g., 0.05 for 5%): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the number of times the interest is compounded per year: ");
        int numberOfCompounds = scanner.nextInt();
        System.out.print("Enter the investment duration (in years): ");
        int years = scanner.nextInt();

        
        calculator.acceptRecord(principal, annualInterestRate, numberOfCompounds, years);
        calculator.calculateFutureValue();
        calculator.printRecord();

        scanner.close();
    }
}
