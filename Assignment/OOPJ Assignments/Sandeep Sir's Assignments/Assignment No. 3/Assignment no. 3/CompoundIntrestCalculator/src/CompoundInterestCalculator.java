public class CompoundInterestCalculator {
    double principal;
    double annualInterestRate;
    int numberOfCompounds;
    int years;
    double futureValue;
    double totalInterest;

    
    public void acceptRecord(double principal, double annualInterestRate, int numberOfCompounds, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfCompounds = numberOfCompounds;
        this.years = years;
    }

    public void calculateFutureValue() {
        futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds), (numberOfCompounds * years));
        totalInterest = futureValue - principal;
    }

    public void printRecord() {
        System.out.printf("Future Value: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
    }
}
