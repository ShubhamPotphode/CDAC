import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your height in meters: ");
		double height = scanner.nextDouble();
		
		System.out.println("Enter your weight in kilograms:");
		double weight = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		
		if(bmi < 18.5) {
			System.out.println("Your bmi is " + bmi + ". You are underweight.");	
		}else if (bmi >=18.5 && bmi < 24.9) {
			System.out.println("Your bmi is " + bmi + ". You have a normal weight.");
		}else if (bmi >= 25.0 && bmi < 29.9) {
			System.out.println("Your bmi is " + bmi + ". You are overweight.");
		}else {
			System.out.println("Your bmi is " + ". You are obese.");	
		}
		scanner.close();
	}

}
