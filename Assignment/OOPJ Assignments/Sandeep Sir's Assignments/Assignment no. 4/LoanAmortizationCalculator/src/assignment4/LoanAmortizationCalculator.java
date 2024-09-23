package assignment4;

public class LoanAmortizationCalculator {
 private double principal;
 private double annualInterestRate;
 private int loanTerm;


 public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
     this.principal = principal;
     this.annualInterestRate = annualInterestRate;
     this.loanTerm = loanTerm;
 }

 
 public double getPrincipal() {
     return principal;
 }

 public void setPrincipal(double principal) {
     this.principal = principal;
 }

 public double getAnnualInterestRate() {
     return annualInterestRate;
 }

 public void setAnnualInterestRate(double annualInterestRate) {
     this.annualInterestRate = annualInterestRate;
 }

 public int getLoanTerm() {
     return loanTerm;
 }

 public void setLoanTerm(int loanTerm) {
     this.loanTerm = loanTerm;
 }

 public double calculateMonthlyPayment() {
     double monthlyInterestRate = (annualInterestRate / 12) / 100;
     int numberOfMonths = loanTerm * 12;
     return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
                       (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
 }

 
 public double calculateTotalPayment() {
     return calculateMonthlyPayment() * loanTerm * 12;
 }

 
 @Override
 public String toString() {
     return String.format("Principal: ₹%.2f, Annual Interest Rate: %.2f%%, Loan Term: %d years",
             principal, annualInterestRate, loanTerm);
 }
}
