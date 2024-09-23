package assignment6;

import java.util.Scanner;
public class ArrayQuestion2 {
	
	public static void main (String []args) {
		
		int [] arr = new int [5];
		
		acceptRecord(arr);
		printRecord(arr);
		
		
	}
	
	public static void acceptRecord(int []arr) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 5 integers : ");
		for (int i=0; i < arr.length ; i++) {
			arr [i]= sc.nextInt();	
			
			
		}
	}
	
	public static void printRecord (int []arr) {
		System.out.println("Array Values:  ");
		for (int i=0; i < arr.length; i++ ) {
			System.out.println("arr =["+i+"]="+ arr[i]);
			
		}
	}

}
