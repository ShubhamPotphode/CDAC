
import java.util.Scanner;

public class TestLoanAmortization {
    public static void main(String[] args) {
        
        LoanAmortizationCalculator calculator = new LoanAmortizationCalculator();

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter Loan Term (years): ");
        int loanTerm = scanner.nextInt();

        
        calculator.acceptRecord(principal, annualInterestRate, loanTerm);
        calculator.calculateMonthlyPayment();
        calculator.printRecord();
    }
}