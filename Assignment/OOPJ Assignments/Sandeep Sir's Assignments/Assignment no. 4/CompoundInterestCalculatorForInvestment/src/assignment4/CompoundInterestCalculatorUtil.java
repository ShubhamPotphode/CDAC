package assignment4;


import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
 private CompoundInterestCalculator compoundCalculator;
 private Scanner scanner = new Scanner(System.in);


 public void acceptRecord() {
     System.out.print("Enter Initial Investment Amount (₹): ");
     double principal = scanner.nextDouble();
     System.out.print("Enter Annual Interest Rate (%): ");
     double annualInterestRate = scanner.nextDouble() / 100;
     System.out.print("Enter Number of Times Interest Compounded per Year: ");
     int numberOfCompounds = scanner.nextInt();
     System.out.print("Enter Investment Duration (in years): ");
     int years = scanner.nextInt();

     compoundCalculator = new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompounds, years);
 }

 
 public void printRecord() {
     if (compoundCalculator == null) {
         System.out.println("Please enter investment details first.");
     } else {
         System.out.println(compoundCalculator.toString());
         double futureValue = compoundCalculator.calculateFutureValue();
         double totalInterest = compoundCalculator.calculateTotalInterest();
         System.out.printf("Future Value: ₹%.2f\n", futureValue);
         System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
     }
 }

 
 public void menuList() {
     System.out.println("1. Enter Investment Details");
     System.out.println("2. Display Investment Details and Calculations");
     System.out.println("0. Exit");
     System.out.print("Choose an option: ");
 }
}
