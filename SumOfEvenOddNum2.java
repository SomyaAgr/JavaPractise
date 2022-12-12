class SumOfEvenOddNum2
{
	public static void main(String[] args) 
	{
		int num=12345;
		int sumEven=0 ,sumOdd=0, ld=0;
		while(num>0)
		{
			if(num%2==0)
			{
				ld=num%10;
				sumEven=sumEven+ld;
			}
			else
			{
				ld=num%10;
				sumOdd=sumOdd+ld;

			}
			num=num/10;
		}
		System.out.println("The Sum of even num is:"+sumEven);
		System.out.println("The Sum of odd num is: "+sumOdd);
	}
}
