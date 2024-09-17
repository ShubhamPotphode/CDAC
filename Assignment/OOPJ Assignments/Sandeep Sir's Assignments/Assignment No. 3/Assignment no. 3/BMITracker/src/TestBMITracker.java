import java.util.Scanner;

public class TestBMITracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMITracker tracker = new BMITracker();

        
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();

        
        tracker.acceptRecord(weight, height);
        tracker.calculateBMI();
        tracker.classifyBMI();
        tracker.printRecord();

        scanner.close();
    }
}
