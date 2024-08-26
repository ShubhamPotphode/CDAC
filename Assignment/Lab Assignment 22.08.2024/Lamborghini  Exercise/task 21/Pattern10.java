class Pattern10{
	public static void main(String args[])
	{
		int i=1,j=1;
		for(i=1;i<10;i+=2)
		{
			for(j=1;j<=i;j+=2)
			{
				System.out.print(j);
			if(j<i)
			{
				System.out.print("*");
			}
			}
		System.out.println("");
		}
	}
}
