import java.util.Scanner;
class Status {
		public static void main(String[] args){	
		Scanner myObj1 = new Scanner(System.in);
		System.out.println("Enter marks of S1");
		int m1 = myObj1.nextInt();
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("Enter marks of S2");
		int m2 = myObj2.nextInt();
		Scanner myObj3 = new Scanner(System.in);
		System.out.println("Enter marks of S3");
		int m3 = myObj3.nextInt();
		int failcount = 0;
		switch(m1>40?1:0)
		{
			case 0:
			{
				failcount++;
				break;
			}
		}
		switch(m2>40?1:0)
		{
			case 0:
			{
				failcount++;
				break;
			}
		}
		switch(m3>40?1:0)
		{
			case 0:
			{
				failcount++;
				break;
			}
		}
		switch(failcount)
		{
			case 0:
			{
				System.out.println("Student has passed");
				break;
			}
			default:
			{
				System.out.println("Student has failed in "+ failcount + " subject(s)");
				break;
			}
		}	
	}
}
