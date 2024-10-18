
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println(isArmStrong(number));
		sc.close();
	}

	static boolean isArmStrong(int n) {
		int digits = 0, temp;
		int sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}

		temp = n;
		while (temp > 0) {
			int lastDigit = temp % 10;
			sum = (int) (sum + Math.pow(lastDigit, digits));
			temp = temp / 10;
		}
		if (sum == n)
			return true;

		return false;
	}

}