class Pattern11{
	public static void main(String args[])
	{
		for(int i=9;i>0;i-=2)
		{
			for(int j=9;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
		System.out.println("");
		}
		for(int i=3;i<=9;i+=2)
		{
			for(int j=9;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}	
		System.out.println("");
		}
	}
}
