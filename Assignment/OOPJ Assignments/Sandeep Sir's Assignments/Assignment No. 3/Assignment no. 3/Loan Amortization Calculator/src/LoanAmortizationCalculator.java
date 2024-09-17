public class LoanAmortizationCalculator {
    double principal;
    double annualInterestRate;
    int loanTerm;
    double monthlyPayment;

    
    public void acceptRecord(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    
    public void calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                         (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    
    public void printRecord() {
        System.out.printf("Monthly Payment: ₹%.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid Over Loan Term: ₹%.2f\n", monthlyPayment * loanTerm * 12);
    }
}