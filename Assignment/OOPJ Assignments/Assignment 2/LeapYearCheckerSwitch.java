import java.util.Scanner;

public class LeapYearCheckerSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		// Determine the leap year status
		int leapYearStatus;

		switch (year % 400) {
		case 0:
			leapYearStatus = 1; // Year is divisible by 400
			break;
		default:
			switch (year % 100) {
			case 0:
				leapYearStatus = 2; // Year is divisible by 100 but not 400
				break;
			default:
				switch (year % 4) {
				case 0:
					leapYearStatus = 3; // Year is divisible by 4 but not 100
					break;
				default:
					leapYearStatus = 4; // Year is not divisible by 4
				}
			}
		}

		// Use switch-case to output the result
		switch (leapYearStatus) {
		case 1:
			System.out.println(year + " is a leap year.");
			break;
		case 2:
			System.out.println(year + " is not a leap year.");
			break;
		case 3:
			System.out.println(year + " is a leap year.");
			break;
		case 4:
			System.out.println(year + " is not a leap year.");
			break;
		default:
			System.out.println("Invalid case.");
		}

		scanner.close(); // Close the scanner
	}
}