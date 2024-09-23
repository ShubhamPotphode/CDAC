package assignment6;

import java.util.Scanner;

public class ArrayQuestion1 {
    public static void main(String[] args) {
    	
    	
        int[] arr = new int[5];
        System.out.println("Default values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Updated values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    
}