
public class TestDiscountCalculator {
	public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        
        calculator.acceptRecord(2000, 10);
        calculator.calculateDiscount();
        calculator.printRecord();
    }

}
