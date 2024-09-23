package assignment4;


import java.util.Scanner;

public class Program {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BMITrackerUtil util = new BMITrackerUtil();
     int choice;

     do {
         util.menuList();
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 util.acceptRecord();
                 break;
             case 2:
                 util.printRecord();
                 break;
             case 0:
                 System.out.println("Exiting the program.");
                 break;
             default:
                 System.out.println("Invalid option. Please try again.");
         }
     } while (choice != 0);

     scanner.close();
 }
}

