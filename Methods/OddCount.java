class OddCount 
{
	public static int countOdd(int num)
	{
		int count=0,ori=num,ld=0;
		while(num>0)
		{
			ld=num%10;
			if (ld%2!=0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.print("The count of odd digit in "+ori+" is  "  );
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(+countOdd(994579));
	}
}
