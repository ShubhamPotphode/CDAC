package assignment6;

public class ArrayMaxMin {

	public static void main (String []args) {
		int [] arr = { 5, 12, 3, 9, 21};
		int max = arr[0];
		int min = arr[0];
		
		
		for (int i  = 1; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
			if (arr[i]< min) min = arr [i];
		}
		
		System.out.println("Maximum : "+ max);
		System.out.println("Minimum : " + min);
		
		
	}
}
