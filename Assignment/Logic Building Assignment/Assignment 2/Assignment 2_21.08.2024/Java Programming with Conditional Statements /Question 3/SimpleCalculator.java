import java.util.Scanner;
class SimpleCalculator {
		public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = myObj.nextInt();
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int n2 = myObj1.nextInt();
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter an operator");
		char operator = myObj2.next().charAt(0);		
		switch(operator)
		{
		case '+':
		{
			System.out.println("Sum of " + n1 + " and " + n2 + " is: " + (n1+n2));
			break;
		}
		case '-':
		{
			System.out.println("Subtraction of " + n2 + " from " + n1 + " is: " + (n1-n2));
			break;
		}
		case '*':
		{
			System.out.println("Product of " + n1 + " and " + n2 + " is: " + n1*n2);
			break;
		}
		case '/':
		{
			if(n2==0)
			{
				System.out.println("Division by 0 is not possible.");
				break;
			}
			else
			{
				System.out.println("Quotient of " + n1 + " and " + n2 + " is: " + n1/n2);
				break;
			}
		}
		default:
		{
			System.out.println("Invalid input");
			break;
		}
		}
	}
}
