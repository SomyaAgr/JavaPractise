class CountEvenOddDigit 
{
	public static void main(String[] args) 
	{
		int num=12345;
		int countEven=0,countOdd=0;
		while(num>0)
		{
			if(num%2==0 )
			{
				countEven++;
			}
			else 
			{
				countOdd++;
			}
			num=num/10;
		}
		System.out.println(""+countEven);
		System.out.println(""+countOdd);
	}
}