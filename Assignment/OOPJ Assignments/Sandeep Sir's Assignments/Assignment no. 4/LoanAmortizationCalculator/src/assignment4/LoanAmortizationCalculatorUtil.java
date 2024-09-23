package assignment4;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
 private LoanAmortizationCalculator loanCalculator;
 private Scanner scanner = new Scanner(System.in);


 public void acceptRecord() {
     System.out.print("Enter Principal Amount (₹): ");
     double principal = scanner.nextDouble();
     System.out.print("Enter Annual Interest Rate (%): ");
     double annualInterestRate = scanner.nextDouble();
     System.out.print("Enter Loan Term (in years): ");
     int loanTerm = scanner.nextInt();

     loanCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
 }

 
 public void printRecord() {
     if (loanCalculator == null) {
         System.out.println("Please enter loan details first.");
     } else {
         System.out.println(loanCalculator.toString());
         double monthlyPayment = loanCalculator.calculateMonthlyPayment();
         double totalPayment = loanCalculator.calculateTotalPayment();
         System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
         System.out.printf("Total Amount Paid Over Loan Term: ₹%.2f\n", totalPayment);
     }
 }


 public void menuList() {
     System.out.println("1. Enter Loan Details");
     System.out.println("2. Display Loan Details and Payment");
     System.out.println("0. Exit");
     System.out.print("Choose an option: ");
 }
}
