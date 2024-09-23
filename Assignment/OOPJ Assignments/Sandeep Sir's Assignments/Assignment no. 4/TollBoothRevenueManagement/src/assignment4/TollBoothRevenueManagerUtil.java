package assignment4;


import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
 private TollBoothRevenueManager tollBooth;
 private Scanner scanner = new Scanner(System.in);


 public void acceptRecord() {
     System.out.print("Enter Toll Rate for Cars (₹): ");
     double carRate = scanner.nextDouble();
     System.out.print("Enter Toll Rate for Trucks (₹): ");
     double truckRate = scanner.nextDouble();
     System.out.print("Enter Toll Rate for Motorcycles (₹): ");
     double motorcycleRate = scanner.nextDouble();

     tollBooth = new TollBoothRevenueManager(carRate, truckRate, motorcycleRate);

     System.out.print("Enter Number of Cars: ");
     int carCount = scanner.nextInt();
     System.out.print("Enter Number of Trucks: ");
     int truckCount = scanner.nextInt();
     System.out.print("Enter Number of Motorcycles: ");
     int motorcycleCount = scanner.nextInt();

     tollBooth.setCarCount(carCount);
     tollBooth.setTruckCount(truckCount);
     tollBooth.setMotorcycleCount(motorcycleCount);
 }

 
 public void printRecord() {
     if (tollBooth == null) {
         System.out.println("Please enter the toll rates and vehicle counts first.");
     } else {
         System.out.println(tollBooth.toString());
         double totalRevenue = tollBooth.calculateTotalRevenue();
         int totalVehicles = tollBooth.calculateTotalVehicles();
         System.out.printf("Total Vehicles: %d\n", totalVehicles);
         System.out.printf("Total Revenue: ₹%.2f\n", totalRevenue);
     }
 }
 
 public void menuList() {
     System.out.println("1. Enter Toll Rates and Vehicle Counts");
     System.out.println("2. Display Total Vehicles and Revenue");
     System.out.println("0. Exit");
     System.out.print("Choose an option: ");
 }
}

