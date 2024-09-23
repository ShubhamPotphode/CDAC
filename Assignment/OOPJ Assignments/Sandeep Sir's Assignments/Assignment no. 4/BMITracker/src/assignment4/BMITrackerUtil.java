package assignment4;


import java.util.Scanner;

public class BMITrackerUtil {
 private BMITracker bmiTracker;
 private Scanner scanner = new Scanner(System.in);

 
 public void acceptRecord() {
     System.out.print("Enter Weight (in kg): ");
     double weight = scanner.nextDouble();
     System.out.print("Enter Height (in meters): ");
     double height = scanner.nextDouble();

     bmiTracker = new BMITracker(weight, height);
 }

 
 public void printRecord() {
     if (bmiTracker == null) {
         System.out.println("Please enter weight and height first.");
     } else {
         System.out.println(bmiTracker.toString());
         double bmi = bmiTracker.calculateBMI();
         String classification = bmiTracker.classifyBMI();
         System.out.printf("BMI: %.2f\n", bmi);
         System.out.println("Classification: " + classification);
     }
 }

 
 public void menuList() {
     System.out.println("1. Enter Weight and Height");
     System.out.println("2. Display BMI and Classification");
     System.out.println("0. Exit");
     System.out.print("Choose an option: ");
 }
}

