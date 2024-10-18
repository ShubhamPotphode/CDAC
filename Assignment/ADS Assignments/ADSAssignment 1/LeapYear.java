import java.util.Scanner;

public class LeapYear{
	static int year;
	public static boolean leap(int year){
		if(year%400==0 || year%100!=0 && year%4==0)
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		System.out.println("Enter a year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		System.out.println(leap(year));	
		}
	}
