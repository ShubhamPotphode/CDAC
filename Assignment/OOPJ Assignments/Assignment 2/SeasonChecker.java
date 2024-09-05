import java.util.Scanner;
public class SeasonChecker {
	public static void main(String[]args) {
	System.out.println("Enter the month number: ");
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	
	if (month== 3 || month==4 || month==5) {
		System.out.println("The season is Spring");
	}else if (month==6 || month==7 || month==8) {
		System.out.println("The season is Summer");
	}else if (month==9 || month==10 || month==11) {
		System.out.println("The season is Autumn");
	}else {
		System.out.println("The season is Winter");
	}
	
	}	
}
