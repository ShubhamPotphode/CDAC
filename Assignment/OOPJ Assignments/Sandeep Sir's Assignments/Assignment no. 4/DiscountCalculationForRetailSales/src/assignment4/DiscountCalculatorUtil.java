package assignment4;


import java.util.Scanner;

public class DiscountCalculatorUtil {
 private DiscountCalculator discountCalculator;
 private Scanner scanner = new Scanner(System.in);

 
 public void acceptRecord() {
     System.out.print("Enter Original Price (₹): ");
     double originalPrice = scanner.nextDouble();
     System.out.print("Enter Discount Percentage: ");
     double discountRate = scanner.nextDouble();

     discountCalculator = new DiscountCalculator(originalPrice, discountRate);
 }

 
 public void printRecord() {
     if (discountCalculator == null) {
         System.out.println("Please enter the original price and discount rate first.");
     } else {
         System.out.println(discountCalculator.toString());
         double discountAmount = discountCalculator.calculateDiscountAmount();
         double finalPrice = discountCalculator.calculateFinalPrice();
         System.out.printf("Discount Amount: ₹%.2f\n", discountAmount);
         System.out.printf("Final Price: ₹%.2f\n", finalPrice);
     }
 }

 
 public void menuList() {
     System.out.println("1. Enter Original Price and Discount Rate");
     System.out.println("2. Display Discount Amount and Final Price");
     System.out.println("0. Exit");
     System.out.print("Choose an option: ");
 }
}
