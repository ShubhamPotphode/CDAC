import java.util.Scanner;

public class CheckPrimeNumber {
	
	public static void main(String [] args){
		
		int number;
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int flag = 0;
		if (number <= 1){
			System.out.println(number + " is not a prime number");
		}
		else {
			int middleNumber = number / 2;
			for (int i =2; i<= middleNumber; i++){
				if (number%i==0){
					System.out.println(number + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0){
				System.out.println(number + " is a prime number");
			}
			sc.close();
		}
		
		}
		


}
