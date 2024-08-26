import java.util.Scanner;
class Discount {
		public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Do you have membership card?");
		char membershipcard = myObj.next().charAt(0);	
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter total purchase amount");
		double tpa = myObj1.nextInt();
		if (tpa>=1000)
		{
			if (membershipcard == 'Y')
			{
				tpa = tpa*0.75;
			}
			else
			{
				tpa = tpa*0.8;
			}
		}
		else if (tpa>=500 && tpa<=999)
		{
			if (membershipcard == 'Y')
			{
				tpa = tpa*0.85;
			}
			else
			{
				tpa = tpa*0.9;
			}
		}
		else
		{
			if (membershipcard == 'Y')
			{
				tpa = tpa*0.9;
			}
			else
			{
				tpa = tpa*0.95;
			}
		}
		System.out.println("Total Purchase Amount after discount = " + tpa);
	}
}
