import java.util.Scanner;
class GCDRecursive{
	
	public static int Gcd(int n1,int n2){
		if(n1==0){
			return n2;
		}
		if(n2==0){
			return n1;
		}
		if(n1>n2){
			return gcd(n1%n2,n2);
		}
		
		return gcd(n1,n2%n1);
		
	}
	
	public static void main(String[] args){
		System.out.println("Enter first number");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		System.out.println(gcd(n1,n2));
	}
}
